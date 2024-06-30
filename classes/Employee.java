package classes;

import java.util.Objects;

/**
 * Класс сотрудника
 */
public class Employee extends Person {
    /**
     * Место работы
     */
    private String workPlace;
    /**
     * Должность
     */
    private String position;
    /**
     * Зарплата
     */
    private int salary;

    /**
     * Конструктор без параметров
     */
    public Employee() {
        super();
        this.workPlace = "не определено";
        this.position = "не определено";
        this.salary = -1;
    }

    /**
     * Конструктор с параметрами, который определяет все поля родительского класса +
     * Класс сотрудников
     *
     * @param firstName - имя
     * @param secondName - фамилия
     * @param adress - адрес
     * @param age - возраст
     * @param weight - вес
     * @param height - рост
     * @param workPlace - место работы
     * @param position - должность
     * @param salary - зарплата
     */
    public Employee(String firstName, String secondName, String adress, int age, int weight, int height,
                    String workPlace, String position, int salary) {

        super(firstName, secondName, adress, age, weight, height);
        this.workPlace = workPlace;
        this.position = position;
        this.salary = salary;
    }

    /**
     * Возвращает строковое представление объекта
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return super.toString() + "workPlace=" + workPlace
                + ", posotion=" + position + ", salary= " + salary;
    }

    /**
     * Возвращает значение хэш-кода для объекта
     *
     * @return значение хэш-кода для этого объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.workPlace, this.position, this.salary);
    }

    /**
     * Метод equals сравненивает, проверяет и сопоставляет само содержимое объектов
     *
     * @param obj - эталонный объект, с которым можно сравнивать
     * @return возвращает true, если этот объект совпадает с объектом или false в противном случае
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return salary == employee.salary && position.equals(
                employee.position);
    }

    /**
     * Возвращает значение поля workPlace объекта класса
     *
     * @return строка workPlace
     */
    public String getWorkPlace() {
        return this.workPlace;
    }

    /**
     * Возвращает значение поля position объекта класса
     *
     * @return строка position
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * Возвращает значение поля salary объекта класса
     *
     * @return целочисленное значение salary
     */
    public int getSalary() {
        return this.salary;
    }

    /**
     * Устанавливает значение поля workPlace для объекта класса obj
     *
     * @param workPlace - место работы
     */
    public void setWorkPlace(String workPlace) throws IllegalArgumentException {
        if (workPlace == null || workPlace.length() == 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.workPlace = workPlace;
    }

    /**
     * Устанавливает значение поля position для объекта класса obj
     *
     * @param position - должность
     */
    public void setPosition(String position) throws IllegalArgumentException {
        if (position == null || position.length() == 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.position = position;
    }

    /**
     * Устанавливает значение поля salary для объекта класса obj
     *
     * @param salary - зарплата
     */
    public void setSalary(int salary) throws IllegalArgumentException {
        if (salary < 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.salary = salary;
    }
}

