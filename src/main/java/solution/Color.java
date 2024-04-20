package solution;

public class Color {
    public static void main(String args[]) {
        int x = printColor(300);
        if (x <= 0)
        {
            System.out.println("Красный");
        }
        else if (x > 0 && x<=100)
        {
            System.out.println("Желтый");
        }
        else if (x > 100)
        {
            System.out.println("Зеленый");
        }
    }

    public static int printColor(int value) {
        return value;
    }
}