package solution;

public class Meth {
        public static void main(String args[]) {
            int x = checkSumSign(0,-3);
            if (x>=0)
            {
                System.out.println("Сумма положительная");
            }
            else if (x<0)
            {
                System.out.println("Сумма отрицательная");
            }
        }
        public static int checkSumSign(int a, int b){
            int sum = a + b;
            return sum;
        }

    }

