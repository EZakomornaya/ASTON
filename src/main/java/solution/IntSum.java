package solution;

public class IntSum {
    public static void main(String[] args) {
        boolean result = false;
        result = isTeen(9, 19);
        System.out.println(result);
    }

    public static boolean isTeen(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }
}