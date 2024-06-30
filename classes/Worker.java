package classes;

import java.util.Objects;

/**
 * Класс рабочего
 */
public class Worker extends Person {
    /**
     * Медицинская страховка
     */
    private int medicalInsuranceCost;
    /**
     * Место работы
     */
    private String workPlace;

    /**
     * Конструктор без параметров
     */
    public Worker() {
        super();
        this.workPlace = "не определено";
        this.medicalInsuranceCost = -1;
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
     * @param medicalInsuranceCost - мед. страховка
     * @param workPlace - место работы
     */
    public Worker(String firstName, String secondName, String adress, int age, int weight, int height,
                  int medicalInsuranceCost, String workPlace) {

        super(firstName, secondName, adress, age, weight, height);
        this.workPlace = workPlace;
        this.medicalInsuranceCost = medicalInsuranceCost;
    }

    /**
     * Возвращает значение хэш-кода для объекта
     *
     * @return значение хэш-кода для этого объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.medicalInsuranceCost, this.workPlace);
    }

    /**
     * Возвращает строковое представление объекта
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return super.toString() + "workPlace=" + workPlace
                + ", medicalInsuranceCost=" + medicalInsuranceCost;
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
        Worker worker = (Worker) obj;
        return medicalInsuranceCost == worker.medicalInsuranceCost && workPlace.equals(
                worker.workPlace);
    }

    /**
     * Возвращает значение поля medicalInsuranceCost объекта класса
     *
     * @return целочисленное medicalInsuranceCost
     */
    public int getMedicalInsuranceCost() {
        return this.medicalInsuranceCost;
    }

    /**
     *Возвращает значение поля workPlace объекта класса
     *
     * @return строка workPlace
     */
    public String getWorkPlace() {
        return this.workPlace;
    }

    /**
     * Устанавливает значение поля medicalInsuranceCost для объекта класса obj
     *
     * @param medicalInsuranceCost - мед. страховка
     */
    public void setMedicalInsuranceCost(int medicalInsuranceCost) throws IllegalArgumentException {
        if (medicalInsuranceCost < 0) {
            throw new IllegalArgumentException("Неправильно, Дядя Фёдор!");
        }
        this.medicalInsuranceCost = medicalInsuranceCost;
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
}
