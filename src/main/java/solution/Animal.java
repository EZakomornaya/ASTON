package solution;

class Animal {
    String name;
    static int count=0;
    public Animal(){
        count++;
    }
    public Animal(String name) {
        this.name = name;

    }
    public static int getcount(){
        return count;
    }
    public void run() {
    }
    public void swim() {
    }
}
