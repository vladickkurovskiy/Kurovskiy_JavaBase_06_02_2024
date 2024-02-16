package ua.hillel.kurovskiy.lessons.lesson4.Homework5;

public class Main {
    public static void main(String[] args) {

        int count = 860; // Кількість солдатів

// Показники династії Лі

        int warrior = 13;
        int archer = 24;
        int horseman = 46;

        int Li = (warrior * count) + (archer * count) + (horseman * count);

        System.out.println("Потужність сил династії Лі: " + Li);

// Показники династії Мінь

        int count2 = (int) (count * 1.5);

        int warrior2 = 9;
        int archer2 = 35;
        int horseman2 = 12;

        int Ming = (warrior2 * count2) + (archer2 * count2) + (horseman2 * count2);

        System.out.println("Потужність сил династії Мінг: " + Ming);

        int winner = Math.max(Li, Ming);

        System.out.println("Найбільша потужність сил у сутичці = " + winner  + " атаки");
    }
}
