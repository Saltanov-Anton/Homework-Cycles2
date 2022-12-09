public class Main {
    public static void main(String[] args) {
        task1();
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

}