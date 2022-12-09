public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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

}