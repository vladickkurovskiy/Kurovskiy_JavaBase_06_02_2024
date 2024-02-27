package ua.hillel.kurovskiy.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("                                    Гра - \"Вгадай число!\"");
        System.out.println("Правила гри: \nКомп'ютер буде генерувати числа від 0 до 10, спробуйте за 5 спроб вгадати число!" );
        System.out.println("Для початку натисніть \"Enter\"");

        scanner.nextLine();

        int Cargument = 0;
        int Uargument = 0;

        for (int i = 0; i < 5; i++) {
            Cargument = (int) (Math.random() * 11);
            System.out.println("Комп'ютер загадав число, введіть ваше значення нижче!");
            Uargument = scanner.nextInt();
            if (i > 10) {
                System.out.println("Введіть значення у діапазоні від 1 до 10");
                System.exit(0);
            } else if (Uargument == Cargument) {
                System.out.println("Ви вгадали число! З перемогою!!!");
                break;
            }

            System.out.println("Спробуйте ще раз)");
            System.out.println();
        }

    }
}
