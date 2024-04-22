package solution;

public class Compare {
    public static void main(String args[]) {
        compareNumbers(33, 6);

    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
    }
}
