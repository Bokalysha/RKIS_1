package classes;

import java.util.Objects;

/**
 * Класс инженера
 */
public class Engineer extends Person {
    /**
     * Образование
     */
    private String education;
    /**
     * Место работы
     */
    private String workPlace;
    /**
     * Рабочий опыт
     */
    private int workExperience;

    /**
     * Конструктор без параметров
     */
    public Engineer() {
        super();
        this.education = "не определено";
        this.workPlace = "не определено";
        this.workExperience = -1;
    }

    /**
     * Конструктор с параметрами, который определяет все поля родительского класса +
     * Класс инженера.
     *
     * @param firstName      - имя
     * @param secondName     - фамилия
     * @param adress         - адрес
     * @param age            - возраст
     * @param weight         - вес
     * @param height         - рост
     * @param workPlace      - место работы
     * @param education      - образование
     * @param workExperience - рабочий опыт
     */
    public Engineer(String firstName, String secondName, String adress, int age, int weight, int height,
                    String workPlace,
                    String education, int workExperience) {

        super(firstName, secondName, adress, age, weight, height);
        this.workPlace = workPlace;
        this.education = education;
        this.workExperience = workExperience;
    }

    /**
     * Возвращает строковое представление объекта
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return super.toString() + "education=" + education
                + ", workPlace=" + workPlace + ", workExperience" + workExperience;
    }

    /**
     * Возвращает значение хэш-кода для объекта
     *
     * @return значение хэш-кода для этого объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.education, this.workPlace, this.workExperience);
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
        Engineer engineer = (Engineer) obj;
        return workExperience == engineer.workExperience && education.equals(
                engineer.education);
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
     * Возвращает значение поля education объекта класса
     *
     * @return строка education
     */
    public String getEducation() {
        return this.education;
    }

    /**
     * Возвращает значение поля workExperience объекта класса
     *
     * @return целочисленное workExperience
     */
    public int getWorkExperience() {
        return this.workExperience;
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
     * Устанавливает значение поля education для объекта класса obj
     *
     * @param education - образование
     */
    public void setEducation(String education) throws IllegalArgumentException {
        if (education == null || education.length() == 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.education = education;
    }

    /**
     * Устанавливает значение поля workExperience для объекта класса obj
     *
     * @param workExperience - рабочий опыт
     */
    public void setWorkExperience(int workExperience) throws IllegalArgumentException {
        if (workExperience < 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.workExperience = workExperience;
    }
}
