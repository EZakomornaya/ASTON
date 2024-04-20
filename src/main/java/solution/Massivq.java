package solution;

public class Massivq {
    public static void main(String args[]) {
        int mas[][] = new int[10][10];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++)
                if (i == j)
                    mas[i][j] = 1;
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++)
                System.out.print(mas[i][j] + " ");
            System.out.println();
        }
    }
}