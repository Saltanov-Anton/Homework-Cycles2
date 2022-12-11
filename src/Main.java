public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int totalEnd = 2_459_000;
        int totalNow = 0;
        int contribution = 15000;
        int month = 0;
        while (totalNow <= totalEnd) {
            totalNow += contribution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalNow + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < number; number--) {
            System.out.print(number + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            int fertility = population / 1000 * 17;
            int mortality = population / 1000 * 8;
            population += fertility - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15000;
        int totalEnd = 12_000_000;
        int totalNow = 0;
        int percent = 0;
        int month = 0;
        while (totalNow <= totalEnd) {
            totalNow += contribution + percent;
            percent += totalNow * 7 / 100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalNow + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15000;
        int totalEnd = 12_000_000;
        int totalNow = 0;
        int percent = 0;
        int month = 0;
        while (totalNow <= totalEnd) {
            totalNow += contribution + percent;
            percent += totalNow * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalNow + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int depositTerm = 108;
        int contribution = 15000;
        long totalNow = 0L;
        long percent = 0L;
        int month = 0;
        while (month <= depositTerm) {
            totalNow += contribution + percent;
            percent += totalNow * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalNow + " рублей");
            }
        }
    }


}