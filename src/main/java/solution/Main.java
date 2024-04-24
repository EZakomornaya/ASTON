package solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        boolean result = false;
        result = isBetween(9, 19);
        System.out.println(result);

        toPosNegativ(7);

        boolean result1 = false;
        result1 = isNeg(7);
        System.out.println(result1);

        toLine("Black", 7);

        inYear(2024);

        changeMas();

        massivSto();

        doubleMassiv();

        squareMassiv();

        inMas(3, 7);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 4;
        int x = a + b;
        if (x >= 0) {
            System.out.println("Сумма положительная");
        } else if (x < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 300;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 4;
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
    }

    public static boolean isBetween(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void toPosNegativ(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else if (a < 0) {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNeg(int t) {
        if (t < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void toLine(String h, int a) {
        int r;
        for (r = 0; r < a; r++) System.out.println(h);
    }

    public static void inYear(int year) {
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
    }

    public static void changeMas() {
        int sample[] = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        for (
                int i = 0;
                i < sample.length; ++i) {
            if (sample[i] == 1) {
                sample[i] = 0;
            } else if (sample[i] == 0) {
                sample[i] = 1;
            }

            System.out.print(sample[i] + " ");
        }
        System.out.print("\n");
    }

    public static void massivSto() {
        int mas[] = new int[100];
        for (int v = 0; v < mas.length; v++) {
            mas[v] = v;
            System.out.print(mas[v] + " ");
        }
        System.out.print("\n");
    }

    public static void doubleMassiv() {
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
    }

    public static void squareMassiv() {
        int nas[][] = new int[5][5];
        for (int i = 0; i < nas.length; i++) {
            for (int j = 0, p = nas[i].length - 1; j < nas[i].length; j++, p--) {
                if (i == j || i == p) nas[i][j] = 1;
                else nas[i][j] = 0;
                System.out.print(nas[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void inMas(int len, int initialValue) {
        int tmas[] = new int[len];
        for (int i = 0; i < tmas.length; ++i) {
            tmas[i] = initialValue;
            System.out.print(tmas[i] + " ");
        }
    }
}



