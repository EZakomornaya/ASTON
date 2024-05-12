package solution;

class Cat extends Animal {
    String iname;
    static int count = 0;
    boolean satiety;
    public Cat(String name, String iname,boolean satiety) {
        this.name = name;
        this.iname = iname;
        this.satiety=false;
        count++;
    }
    public static int getcount() {
        return count;
    }
    public void run(int a) {
        if (a <= 200) {
            System.out.println(name + iname + ".run(" + a + ");" + ": " + iname + " пробежал " + a + " м");
        }
    }
    public void swim(int b) {
        if (b == 0) {
            System.out.println(name + iname + ".swim(" + b + ");" + ": " + iname + " проплыл " + b + " м");
        }
    }
    //Кормим кота (для сытости коту необходимо поесть на 5)
    public static int feedCats(int plate, Cat[] cats) {
        for (Cat cat : cats) {
            if (!cat.satiety && plate >= 5) {
                cat.satiety = true;
                plate -= 5;
            }
        }
        return plate;
    }
    public static int addFoodAtPlate(int plate, int amountOfFood) {
        return plate + amountOfFood;
    }
}
