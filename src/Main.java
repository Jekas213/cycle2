public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int contribution = 15000;
        int total = 0;
        int month = 0;
        while (total<2459000) {
            month++;
            total=total+contribution;
            System.out.println("Месяц " +month+ " сумма накоплений равна " +total);
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i<10) {
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for ( ; i>0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int age = 0;
        while (age<10) {
            age++;
            population+=population/1000*(birthRate-deathRate);
            System.out.println("Год "+age+", численность населения составляет "+population);
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        int contribution = 15_000;
        int percent = 7;
        int month = 0;
        while (contribution<12_000_000) {
            month++;
            contribution+=contribution*percent/100;
            System.out.println("месяц "+month+", сумма "+contribution);

        }

    }

    public static void task5 () {
        System.out.println("Задача 5");
        int contribution = 15_000;
        int percent = 7;
        int month = 0;
        while (contribution<12_000_000) {
            month++;
            contribution+=contribution*percent/100;
            if (month % 6 == 0) {
                System.out.println("месяц " + month + ", сумма " + contribution);
            }

        }

    }

    public static void task6 () {
        System.out.println("Задача 6");
        int contribution = 15000;
        int percent = 7;
        int month = 1;
        for (; month<=108; month++) {
            contribution+=contribution*percent/100;
            if (month % 6 == 0) {
                System.out.println("месяц"+month+", сумма накоплений "+contribution);
            }

        }

    }

    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 5;
        while (friday<31) {
            System.out.println("Сегодня пятница "+friday+" число");
            friday+=7;
        }

    }

    public static void task8 () {
        System.out.println("Задача 8");
        for (int i = 0; i <= 2123; i+=79) {
            if (i < 2122 && i > 1822) {
                System.out.println(i);
            }
        }

    }
}