import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        checkYear(year);
    }
    public static void checkYear(int yearIn) {
        if (yearIn % 4 == 0) {
            if (yearIn % 100 != 0) {
                System.out.println(yearIn + " год является високосным");
            }
            ;
        } else System.out.println(yearIn + " год не является високосным");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int iOs = 0;
        int android = 1;
        int clientDeviceYear = 2015;
        System.out.println("Вариант первый (IOS)");
        appInstall(iOs, clientDeviceYear);
        System.out.println("Вариант второй (ANDROID)");
        appInstall(android, clientDeviceYear);
    }

    public static void appInstall(int operationSystem, int date) {
        int currentYear = LocalDate.now().getYear();
        if (operationSystem == 0) {
            if (date < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operationSystem == 1) {
            if (date < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        System.out.println(deliveryPeriod(deliveryDistance));
    }
    public static String deliveryPeriod(int distance) {
        int deliveryDay = 1;
        if (distance <= 20)
            return ("Потребуется дней: " + distance);
        else if (distance > 20 && distance <= 60)
            return ("Потребуется дней: " + deliveryDay * 2);
        else if (distance > 60 && distance <= 100)
            return ("Потребуется дней: " + deliveryDay * 3);
        else
            return ("Доставки нет");
    }
}