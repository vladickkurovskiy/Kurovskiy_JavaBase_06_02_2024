package ua.hillel.kurovskiy.lessons.lesson5.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//БЛОК ПЕРШОЇ КОМАНДИ
        System.out.println("Введіть ім'я першої команди:");
        String Team1 = scanner.nextLine();

        System.out.println("Команда 1 - " + Team1);
        System.out.println();

        System.out.println("Введіть кількість фрагів для кожного гравця команди \""  + Team1 + "\":");

        int player1Team1 = 0 ;
        int player2Team1 = 0 ;
        int player3Team1 = 0 ;
        int player4Team1 = 0 ;
        int player5Team1 = 0 ;

        if (scanner.hasNextInt()) {
            player1Team1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки першого гравця: " + player1Team1);
        } else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }if (scanner.hasNextInt()) {
            player2Team1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки другого гравця: " + player2Team1);
        }else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }if (scanner.hasNextInt()) {
            player3Team1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки третього гравця: " + player3Team1);
        } else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }if (scanner.hasNextInt()) {
            player4Team1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки четвертого гравця: " + player4Team1);
        }else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }if (scanner.hasNextInt()) {
            player5Team1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки п'ятого гравця: " + player5Team1);
        }else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }

        System.out.println();
        System.out.println();

//БЛОК ДРУГОЇ КОМАНДИ
        System.out.println("Введіть ім'я другої команди:");
        String Team2 = scanner.nextLine();

        System.out.println("Команда 2 - " + Team2);
        System.out.println();

        System.out.println("Введіть кількість фрагів для кожного гравця команди \""  + Team2 + "\":");

        int player1Team2 = 0 ;
        int player2Team2 = 0 ;
        int player3Team2 = 0 ;
        int player4Team2 = 0 ;
        int player5Team2 = 0 ;

        if (scanner.hasNextInt()) {
            player1Team2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки першого гравця: " + player1Team2);
        } else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }if (scanner.hasNextInt()) {
            player2Team2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки другого гравця: " + player2Team2);
        }else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }if (scanner.hasNextInt()) {
            player3Team2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки третього гравця: " + player3Team2);
        } else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }if (scanner.hasNextInt()) {
            player4Team2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки четвертого гравця: " + player4Team2);
        }else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }if (scanner.hasNextInt()) {
            player5Team2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Очки п'ятого гравця: " + player5Team2);
        }else {
            System.out.println("Будь-ласка введіть числове значення!");
            System.exit(0);
        }

        System.out.println();
        System.out.println("Натисніть \"Enter\" для продовження");
        scanner.nextLine();

        //СЕРЕДНІ АРИФМЕТИЧНІ КОМАНД
        int Team1Points = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1)/5;
        System.out.println("Середнє арифметичне першої команди = " + Team1Points);

        int Team2Points = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2)/5;
        System.out.println("Середнє арифметичне другої команди = " + Team2Points);

        System.out.println();
        System.out.println("Натисніть \"Enter\" для продовження");
        scanner.nextLine();

        //ПІДСУМОК ТА ВИЗНАЧЕННЯ ПЕРЕМОЖЦЯ
        System.out.println("По підсумкам матча та підрахунку середньго арифметичного: ");
        if (Team1Points > Team2Points) {
            System.out.println("Перемагає команда " + '\"' + Team1 + '\"' + ", набравши " + Team1Points + " очків!!!");
        } else if (Team1Points < Team2Points) {
            System.out.println("Перемагає команда " + '\"' + Team2 + '\"' + ", набравши " + Team2Points + " очків!!!");
        } else if (Team1Points == Team2Points) {
            System.out.println("Об'являється нічия та перемагають обидві команди!!!" + ", набравши" + Team1Points + "очків!!!");
            System.out.println("ВІТАЄМО!!!!");
        }

//ЧЕРНЕТКА З ПРОШЛИМ КОДОМ
//        int Playercount = 0;
//
//        int player1 = 0 ;
//
//
//        for (int i = 0; i < 5; i++) {
//            switch (++Playercount) {
//                case 1: {
//                    System.out.print("Перший гравець: ");
//                    break;
//                }
//                case 2: {
//                    System.out.print("Другий гравець: ");
//                    break;
//                }
//                case 3: {
//                    System.out.print("Третій гравець: ");
//                    break;
//                }
//                case 4: {
//                    System.out.print("Четвертий гравець: ");
//                    break;
//                }
//                case 5: {
//                    System.out.print("П'ятий гравець: ");
//                    break;
//                }
//                default: {
//                    System.out.println("default");
//                    break;
//                }
//            }
//            if (scanner.hasNextInt()) {
//                player1 = scanner.nextInt();
//                scanner.nextLine();
//                System.out.println("Очки " + Playercount + "го гравця: " + player1);
//            } else {
//                System.out.println("Будь-ласка введіть числове значення!");
//                System.exit(0);
//            }
//            System.out.println();
//        }
    }
}
