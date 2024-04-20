package solution;

public class Year {
    public static void main(String[] args) {
    int year = 2024;
    boolean leapyear = (
      year > 1584 &&
      (
        (year % 400 == 0) ||
        (year %4 == 0 && year % 100 != 0)
      )
    );
    if (leapyear)
      System.out.println("Год " + year + " високосный");
    else
      System.out.println("Год " + year + " не високосный");
    }
}


