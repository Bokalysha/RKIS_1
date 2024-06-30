package tui;

import classes.*;
import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.System.out;

/***
 * Класс текстового меню
 */
public class TUI {

    /**
     * Метод меню, выполняющийся при начале работы
     */
    public static void start() {
        ArrayList<Person> persons = new ArrayList<Person>();

        int choice;
        do {
            menuOutput();
            choice = Input.naturalIntInput();
            switch (choice) {
                case 1:
                    int classType = getClassType();
                    persons.add(classCreater(classType));
                    break;
                case 2:
                    if (persons.size() == 0) {
                        System.err.println("Сначала нужно добавить элементы!");
                        break;
                    }
                    System.out.println("Введите порядковый индекс элемента!");
                    choice = Input.naturalIntInput();
                    if (choice > persons.size() || choice < 1) {
                        System.err.println("Выбран несуществующий индекс!");
                        break;
                    }
                    persons.remove(choice - 1);
                    successMessage();
                    break;
                case 3:
                    if (persons.size() == 0) {
                        System.err.println("Сначала нужно добавить элементы!");
                        break;
                    }
                    for (int i = 0; i < persons.size(); i++) {
                        System.out.println("№ " + (i + 1));
                        System.out.println(persons.get(i).toString());
                    }
                    successMessage();
                    break;
                case 4:
                    if (persons.size() == 0) {
                        System.err.println("Сначала нужно добавить элементы!");
                        break;
                    }
                    System.out.println("Введите порядковый индекс элемента!");
                    choice = Input.naturalIntInput();
                    if (choice > persons.size() || choice < 1) {
                        System.err.println("Выбран несуществующий индекс!");
                        break;
                    }
                    Person obj1 = persons.get(choice - 1);
                    System.out.println("Введите порядковый индекс второго элемента!\n");
                    choice = Input.naturalIntInput();
                    if (choice > persons.size() || choice < 1) {
                        System.err.println("Выбран несуществующий индекс!");
                        break;
                    }
                    Person obj2 = persons.get(choice - 1);

                    out.println(obj1.equals(obj2));
                    out.println("\n");
                    break;
                case 5:
                    menuOutput();
                    break;
                default:
                    if (choice != 6) {
                        System.err.println("Использована неизвестная команда!");
                    }
            }
        } while (choice != 6);

        out.println("Ты заходи, если что");
    }

    /**
     * Конструктор с заполнением полей
     *
     * @param classType - тип класса
     * @return Person - обычная персона
     */
    private static Person classCreater(int classType) {
        Scanner in = new Scanner(System.in);
        String firstName;
        String secondName;
        String adress;
        int age;
        int height;
        int weight;
        System.out.println("Введите имя: ");
        firstName = in.nextLine();
        System.out.println("Введите фамилию: ");
        secondName = in.nextLine();
        System.out.println("Введите адрес: ");
        adress = in.nextLine();
        System.out.println("Введите возраст: ");
        age = Input.naturalIntInput();
        System.out.println("Введите рост: ");
        height = Input.naturalIntInput();
        System.out.println("Введите вес: ");
        weight = Input.naturalIntInput();
        switch (classType) {
            case 0:
                return new Person(firstName, secondName, adress, age, weight, height);
            case 1:
                String workPlace;
                String position;
                int salary;
                System.out.println("Введите место работы: ");
                workPlace = in.nextLine();
                System.out.println("Введите должность: ");
                position = in.nextLine();
                System.out.println("Введите зарплату: ");
                salary = Input.naturalIntInput();
                return new Employee(firstName, secondName, adress, age, weight, height, workPlace, position, salary);
            case 2:
                String workPlace1;
                int medicalInsuranceCost;
                System.out.println("Введите место работы: ");
                workPlace1 = in.nextLine();
                System.out.println("Введите стоимость страховки: ");
                medicalInsuranceCost = Input.naturalIntInput();
                return new Worker(firstName, secondName, adress, age, weight, height, medicalInsuranceCost, workPlace1);
            case 3:
                String education;
                String workPlace2;
                int workExperience;
                System.out.println("Введите уровень образования: ");
                education = in.nextLine();
                System.out.println("Введите место работы: ");
                workPlace2 = in.nextLine();
                System.out.println("Введите опыт работы: ");
                workExperience = Input.naturalIntInput();
                return new Engineer(firstName, secondName, adress, age, weight, height, workPlace2, education,
                        workExperience);

        }
        return new Person(firstName, secondName, adress, age, weight, height);
    }

    private static void successMessage() {
        out.println("МЕГАХАРОШ!");
    }

    /**
     * Создание объекта по типу класса
     *
     * @return int - номер класса
     */
    public static int getClassType() {
        out.print("""
                ______________________________
                Создать класс:
                0 - Общий
                1 - Сотрудник
                2 - Рабочий
                3 - Инженер
                ______________________________
                """);
        int num = Input.intInput();
        while (!(num >= 0 && num <= 3)) {
            out.println("В меню нет такого пункта!");
            num = Input.intInput();
        }
        return num;

    }

    public static void menuOutput() {

        String menu = ("""
                                
                Меню
                ______________________________
                Выберите пункт меню:
                1 - Добавить новый элемент
                2 - Удалить новый элемент
                3 - Показать все элементы
                4 - Сравнить два элемента
                5 - Меню
                6 - Выход
                ______________________________
                """);
        out.println(menu);
    }
}
