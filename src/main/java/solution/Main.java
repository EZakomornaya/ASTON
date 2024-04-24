package solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(isBetween(1, 1));

        toPosNegativ(7);

        System.out.println(isNeg(-3));

        toLine("Black", 7);

        System.out.println(inYear(2024));

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
        int b = -4;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else  {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 300;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else  {
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
        boolean sum= ((a+b) >= 10 && (a+b) < 20); return sum;
    }

    public static void toPosNegativ(int a) {
        if (a >= 0)
           System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    public static boolean isNeg(int t) {
        boolean d=(t < 0);
            return d;
    }

    public static void toLine(String h, int a) {
        int r;
        for (r = 0; r < a; r++) System.out.println(h);
    }

    public static boolean inYear(int year) {
        boolean leapyear = (
                year > 1584 &&
                        (
                                (year % 400 == 0) ||
                                        (year % 4 == 0 && year % 100 != 0)
                        )
        ); return leapyear;
    }

    public static void changeMas() {
        int sample[] = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        for (
                int i = 0;
                i < sample.length; ++i) {
            if (sample[i] == 1) {
                sample[i] = 0;
            } else {
                sample[i] = 1;
            }

            System.out.print(sample[i] + " ");
        }
        System.out.print("\n");
    }

    public static void massivSto() {
        int mas[] = new int[100];
        for (int v = 1; v < mas.length; v++) {
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



