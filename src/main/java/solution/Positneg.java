package solution;

public class Positneg {
    public static void main(String[] args) {
        boolean result = false;
        result = isTeen(7);
        System.out.println(result);

    }

    public static boolean isTeen(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}




