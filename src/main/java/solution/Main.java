package solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords("Orange");
        printThreeWords("Banana");
        printThreeWords("Apple");
        int x = checkSumSign(0, -3);
        if (x >= 0) {
            System.out.println("Сумма положительная");
        } else if (x < 0) {
            System.out.println("Сумма отрицательная");
        }


        int y = printColor(300);
        if (y <= 0) {
            System.out.println("Красный");
        } else if (y > 0 && y <= 100) {
            System.out.println("Желтый");
        } else if (y > 100) {
            System.out.println("Зеленый");
        }
        compareNumbers(33, 6);
        boolean result = false;
        result = isTeen(9, 19);
        System.out.println(result);

        int z = toPosNegativ(0);
        boolean rev = z >= 0;
        if (rev) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

        boolean result1 = false;
        result1 = inTeen(7);
        System.out.println(result1);

        String test = "Black";
        int e = 8;
        int r;
        for (r = 0; r < e; r++) System.out.println(test);

        int year = 2024;
        boolean leapyear = (
                year > 1584 &&
                        (
                                (year % 400 == 0) ||
                                        (year % 4 == 0 && year % 100 != 0)
                        )
        );
        if (leapyear)
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");
        int sample[] = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        for (int i = 0; i < sample.length; ++i) {
            if (sample[i] == 1) {
                sample[i] = 0;
            } else if (sample[i] == 0) {
                sample[i] = 1;
            }

            System.out.print(sample[i] + " ");

        }
        System.out.print("\n");

        int mas[] = new int[100];
        for (int v = 0; v < mas.length; v++) {
            mas[v] = v;
            System.out.print(mas[v] + " ");
        }
        System.out.print("\n");
        int mass[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; ++i) {
            if (mass[i] < 6) {
                mass[i] = (mass[i] * 2);
            } else if (mass[i] > 6) {
                mass[i] = mass[i];
            }
            System.out.print(mass[i] + " ");
        }
        System.out.print("\n");
        int nas[][] = new int[5][5];
        for (int i = 0; i < nas.length; i++) {
            for (int j = 0, p = nas[i].length - 1; j < nas[i].length; j++, p--) {
                if (i == j || i == p) nas[i][j] = 1;
                else nas[i][j] = 0;
                System.out.print(nas[i][j] + " ");
            }
            System.out.print("\n");
        }
        Scanner initialValue = new Scanner(System.in);
        System.out.println("введите значение initialValue");
        int n = initialValue.nextInt();
        Scanner len = new Scanner(System.in);
        System.out.println("введите значение len");
        int m = len.nextInt();
        int tmas[] = new int[m];
        for (int i = 0; i < tmas.length; ++i) {
            mas[i] = n;
            System.out.print(tmas[i] + " ");
        }
    }

    public static void printThreeWords(String s) {
        System.out.println(s);
    }

    public static int checkSumSign(int a, int b) {
        int sum = a + b;
        return sum;
    }


    public static int printColor(int value) {
        return value;
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
    }

    public static boolean isTeen(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static int toPosNegativ(int a) {
        return a;
    }

    public static boolean inTeen(int t) {
        if (t < 0) {
            return true;
        } else {
            return false;
        }
    }

}



