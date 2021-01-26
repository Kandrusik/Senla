package eu.senla.task2;

import java.util.Scanner;

public class Rainbow {
    private final String[] colors = new String[]{"Красн","Оранжев","Желт","Зелен","Голуб","Син","Фиолетов"};
    private Scanner input = new Scanner(System.in);
    public  void color() {
        System.out.println("Введите колличество цветов: 1 или 2");
        int n = input.nextInt();
        if (n == 1) {
            System.out.println("Введите номер цвета от 1 до 7");
            int number = input.nextInt();
            System.out.println("Радуга " + colors[number-1] + "ого цвета");
        } else if (n == 2) {
            System.out.println("Введите номера двух цветов от 1 до 7");
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            System.out.println("Радуга " + colors[number1-1] + "о-" + colors[number2-1] + "ого цвета");
        } else if (n!=1 && n!=2) {
            System.out.println("Вы ввели неверные значения");
        }

    }
}