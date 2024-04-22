package solution;

public class Massivq {
    public static void main(String args[]) {
        int mas[][] = new int[5][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0, x = mas[i].length - 1; j < mas[i].length; j++, x--) {
                if (i == j || i == x) mas[i][j] = 1;
                else mas[i][j] = 0;
                System.out.print(mas[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
