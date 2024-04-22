package solution;

import java.util.Scanner;

public class Init {
    public static void main(String[] args) {
        Scanner initialValue = new Scanner(System.in);
        System.out.println("введите значение initialValue");
        int x = initialValue.nextInt();
        Scanner len = new Scanner(System.in);
        System.out.println("введите значение len");
        int y = len.nextInt();
        int mas[] = new int[y];
        for (int i = 0; i < mas.length; ++i) {
            mas[i] = x;
            System.out.print(mas[i] + " ");
        }
    }
}

