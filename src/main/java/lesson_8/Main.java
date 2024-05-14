package lesson_8;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "test", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect3 = {
                {"1", "2", "3", "4"},
                {"1", "2", "4", "тест"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            main.stringExceptionTest(correct);
            main.stringExceptionTest(incorrect1);
            main.stringExceptionTest(incorrect2);
            main.stringExceptionTest(incorrect3);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public void stringExceptionTest(String[][] arr)
            throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4) throw new
                    MyArraySizeException(String.format("Неверный размер массива"));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
            System.out.println(" ");
        }
        System.out.println(sum);
    }

    class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    class MyArrayDataException extends NumberFormatException {
        MyArrayDataException(int row, int col) {
            super(String.format("Преобразование в элементе массива не удалось. Ячейка [" + row + "][" + col + "]"));
        }
    }
}









