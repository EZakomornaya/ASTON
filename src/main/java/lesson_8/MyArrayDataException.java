package lesson_8;

class MyArrayDataException extends NumberFormatException {
    MyArrayDataException(int row, int col) {
        super(String.format("Преобразование в элементе массива не удалось. Ячейка [" + row + "][" + col + "]"));
    }
}

