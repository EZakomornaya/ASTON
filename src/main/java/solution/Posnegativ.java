package solution;

public class Posnegativ {
    public static void main(String args[]) {
        int x = toPosNegativ(0);
        boolean rev = x >= 0;
        if (rev) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static int toPosNegativ(int a) {
        return a;
    }
}

