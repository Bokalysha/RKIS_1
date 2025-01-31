package tui;

import java.util.Scanner;

/**
 * Класс для ввода в консоль
 */
public class Input {

    /**
     * Метод для проверки принадлежности числа типа int к натуральным числам
     *
     * @return положитлеьное число типа int
     */
    public static int naturalIntInput() {
        int num;
        do {
            num = intInput();
            if (num <= 0) {
                System.err.println("Число должно быть положительным!");
            }
        } while (num <= 0);
        return num;
    }

    /**
     * Метод для ввода и проверки вводимых значений типа int
     *
     * @return значение int
     */
    public static int intInput() {
        int num;
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.err.println("Некорректный ввод!");
            in.next();
        }
        num = in.nextInt();
        return num;
    }
}
