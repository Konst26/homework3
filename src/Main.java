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
        System.out.println("задача1");
      byte eggs = 1;
      short boxes = 10;
      int hours = 1000;
      long time = 123456799L;
      float years = 2.56F;
      double lastTime = 3.5479;
    }
    public static void task2 () {
        System.out.println("задача2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte j = 67;
    }
    public static void task3 () {
        System.out.println("задача3");
        byte a = 23;
        byte b = 27;
        byte c = 30;
        byte student = (byte) (a + b + c);
        short d = 480;
        short sheet = (short) (d / student);
        System.out.println("на каждого ученика рассчитано " + sheet + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("задача4");
        byte performance = 16;
        byte time = 20;
        short quantity = (short) (performance * time);
        System.out.println("за " + time + " минут машина произвела " + quantity + " бутылок");
        byte performance2 = 48;
        short  time2 = 1440;
        int quantity2 = (int) (performance2 * time2);
        System.out.println("за " + time2 + " минут машина произвела " + quantity2 + " бутылок");
        byte performance3 = 48;
        short  time3 = 4320;
        int quantity3 = (int) (performance3 * time3);
        System.out.println("за " + time3 + " минут (3 дня) машина произвела " + quantity3 + " бутылок");
        byte performance4 = 48;
        int  time4 = 43200;
        int quantity4 = (int) (performance4 * time4);
        System.out.println("за " + time4 + " минут (месяц) машина произвела " + quantity4 + " бутылок");
    }
    public static void task5 () {
        System.out.println("задача5");
        byte white = 2;
        byte brown = 4;
        byte oneClass = (byte) (white + brown);
        byte classRoom = (byte) (120 / oneClass);
        byte allWhite = (byte) (classRoom * white);
        byte allBrown = (byte) (classRoom * brown);
        System.out.println("в школе, где " + classRoom + " клаасов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("задача6");
        short weightBananas = 80;
        short weightMilk = 105;
        short weightIceCream = 100;
        short weightEggs = 70;
        short breakfastInGram = (short) ((weightBananas * 5) + (weightMilk * 2) + (weightIceCream * 2) + (weightEggs * 4));
        float breakfastInKilogram = (float) (breakfastInGram / 1000);
        System.out.println("завтрак в граммах составит " + breakfastInGram + " , а в килограммах " + breakfastInKilogram);
    }
    public static void task7 () {
        System.out.println("задача7");
        short weight1 = 250;
        short weight2 = 500;
        short totalWeight = 7000;
        short days1 = (short) (totalWeight / weight1);
        short days2 = (short) (totalWeight / weight2);
        System.out.println("если терять в день 250 гр., то для достижения результата потребуется " + days1);
        System.out.println("если терять в день 500 гр., то для достижения результата потребуется " + days2);
    }
    public static void task8 () {
        System.out.println("задача8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double newSalaryMasha = (double) ((salaryMasha * 0.1) + salaryMasha);
        double newSalaryDenis = (double) ((salaryDenis * 0.1) + salaryDenis);
        double newSalaryKristina = (double) ((salaryKristina * 0.1) + salaryKristina);
        int yearSalaryM = (int) (salaryMasha * 12);
        int yearSalaryD = (int) (salaryDenis * 12);
        int yearSalaryK = (int) (salaryKristina * 12);
        int newYSM = (int) (newSalaryMasha * 12);
        int newYSD = (int) (newSalaryDenis * 12);
        int newYSK = (int) (newSalaryKristina * 12);
        int incomeYearM = (int) (newYSM - yearSalaryM);
        int incomeYearD = (int) (newYSD - yearSalaryD);
        int incomeYearK = (int) (newYSK - yearSalaryK);
        System.out.println("Маша теперь получает " + newSalaryMasha + "рублей. Годовой доход вырос на " + incomeYearM);
        System.out.println("Денис теперь получает " + newSalaryDenis + "рублей. Годовой доход вырос на " + incomeYearD);
        System.out.println("Кристина теперь получает " + newSalaryKristina + "рублей. Годовой доход вырос на " + incomeYearK);
    }






}