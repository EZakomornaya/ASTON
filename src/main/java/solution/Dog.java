package solution;

class Dog extends Animal {
    String dName;
    static int count = 0;

    public Dog(String name, String dName) {
        this.name = name;
        this.dName = dName;
        count++;
    }

    public static int getcount() {
        return count;
    }

    public void run(int a) {
        if (a <= 500) {
            System.out.println(name + dName + ".run(" + a + ");" + ": " + dName + " пробежал " + a + " м");
        }
    }

    public void swim(int b) {
        if (b <= 10) {
            System.out.println(name + dName + ".swim(" + b + ");" + ": " + dName + " проплыл " + b + " м");
        }
    }
}
