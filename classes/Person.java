package classes;

import java.util.Objects;

/**
 * Класс персоны
 */
public class Person {
    /**
     * Имя
     */
    private String firstName;
    /**
     * Фамилия
     */
    private String secondName;
    /**
     * Адрес
     */
    private String adress;
    /**
     * Возраст
     */
    private int age;
    /**
     * Рост
     */
    private int height;
    /**
     * Вес
     */
    private int weight;

    /**
     * Конструктор без параметров
     */
    public Person() {
        this.firstName = "не определено";
        this.secondName = "не определено";
        this.adress = "не определено";
        this.age = -1;
        this.height = -1;
        this.weight = -1;
    }

    /**
     * Конструктор с параметрами, который определяет все поля класса
     *
     * @param firstName - имя
     * @param secondName - фамилия
     * @param adress - адрес
     * @param age - возраст
     * @param weight - вес
     * @param height - рост
     */
    public Person(String firstName, String secondName, String adress, int age, int weight, int height) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.adress = adress;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Метод equals сравненивает, проверяет и сопоставляет само содержимое объектов
     *
     * @param obj - эталонный объект, с которым можно сравнивать
     * @return возвращает {@code true}, если этот объект совпадает с объектом или
     * {@code false} в противном случае
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return this.age == person.age && firstName.equals(person.firstName);
    }

    /**
     * Возвращает значение хэш-кода для объекта
     *
     * @return значение хэш-кода для этого объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, adress, age, height,
                weight);
    }

    /**
     * Возвращает строковое представление объекта
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "firstName= " + firstName
                + ", secondName= " + secondName
                + ", adress= " + adress
                + ", age=" + age
                + ", height= " + height
                + ", weight= " + weight
                + '\n';
    }

    /**
     * Возвращает значение поля firstName объекта класса
     *
     * @return строка firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Возвращает значение поля secondName объекта класса
     *
     * @return строка secondName
     */
    public String getSecondName() {
        return this.secondName;
    }

    /**
     * Возвращает значение поля adress объекта класса
     *
     * @return строка adress
     */
    public String getAdress() {
        return this.adress;
    }

    /**
     * Возвращает значение поля age объекта класса
     *
     * @return целочисленное age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Возвращает значение поля height объекта класса
     *
     * @return целочисленное height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Возвращает значение поля weight объекта класса
     *
     * @return целочисленное weight
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Устанавливает значение поля firstName для объекта класса obj
     *
     * @param firstName - имя
     */
    public void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null || firstName.length() == 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.firstName = firstName;
    }

    /**
     * Устанавливает значение поля secondName для объекта класса obj
     *
     * @param secondName - фамилия
     */
    public void setSecondName(String secondName) throws IllegalArgumentException {
        if (secondName == null || secondName.length() == 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.secondName = secondName;
    }

    /**
     * Устанавливает значение поля adress для объекта класса obj
     *
     * @param adress - адрес
     */
    public void setAdress(String adress) throws IllegalArgumentException {
        if (firstName == null || firstName.length() == 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.adress = adress;
    }

    /**
     * Устанавливает значение поля age для объекта класса obj
     *
     * @param age - возраст
     */
    public void setAge(int age) throws IllegalArgumentException {
        if (age <= 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.age = age;
    }

    /**
     * Устанавливает значение поля height для объекта класса obj
     *
     * @param height - рост
     */
    public void setHeight(int height) throws IllegalArgumentException {
        if (height <= 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.height = height;
    }

    /**
     * Устанавливает значение поля weight для объекта класса obj
     *
     * @param weight - вес
     */
    public void setWeight(int weight) throws IllegalArgumentException {
        if (weight <= 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.weight = weight;
    }

}
