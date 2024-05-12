package solution;

class Dog extends Animal {
    String dname;
    static int count=0;
    public Dog(String name, String dname) {
        this.name = name;
        this.dname = dname;
        count++;
    }
    public static int getcount(){
        return count;
    }
    public void run(int a) {
        if (a <= 500) {
            System.out.println(name + dname + ".run(" + a + ");" + ": " + dname + " пробежал " + a + " м");
        }
    }
    public void swim(int b) {
        if (b <= 10) {
            System.out.println(name + dname + ".swim(" + b + ");" + ": " + dname + " проплыл " + b + " м");
        }
    }
}
