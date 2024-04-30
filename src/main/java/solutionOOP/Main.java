package solutionOOP;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Zakomornaya Kate", "Engineer", "ekatenaum@gmail.com",
                "+79605851130", 30000, 34);
        employee1.print();
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
                30000, 30);
        persArray[1] = new Employee("Ivanov Tom", "Engineer", "ivivao@mailbox.com", "892312313",
                30000, 30);
        persArray[2] = new Employee("Ivanov Paul", "Engineer", "ivivak@mailbox.com", "892312314",
                30000, 30);
        persArray[3] = new Employee("Ivanova Rita", "Engineer", "ivivap@mailbox.com", "892312315",
                30000, 30);
        persArray[4] = new Employee("Ivanova Anya", "Engineer", "ivivau@mailbox.com", "892312316",
                30000, 30);
        Park park = new Park("central");
    }
}

class Employee {
    private String fullname;
    private String position;
    private String email;
    private String cellphone;
    private int salary;
    private int age;

    public Employee(String fullname, String position, String email, String cellphone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.cellphone = cellphone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println(fullname + " " + position + " " + email + " " + cellphone + " " + salary + " " + age);
    }
}
class Park {
    String name;
    Amusement amusement;

    Park(String name) {
        this.name = name;
    }

    Amusement amusement1 = new Amusement("koleso", "10-19", 10);

    private class Amusement {
        private String amusementname;
        private String worktime;
        private int price;

        public Amusement(String amusementname, String worktime, int price) {
            this.amusementname = amusementname;
            this.worktime = worktime;
            this.price = price;
        }
    }
}



