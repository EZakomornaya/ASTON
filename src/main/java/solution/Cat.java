package solution;

class Cat extends Animal {
    String iName;
    static int count = 0;
    boolean satiety;

    public Cat(String name, String iName, boolean satiety) {
        this.name = name;
        this.iName = iName;
        this.satiety = false;
        count++;
    }

    public static int getcount() {
        return count;
    }

    public void run(int a) {
        if (a <= 200) {
            System.out.println(name + iName + ".run(" + a + ");" + ": " + iName + " пробежал " + a + " м");
        }
    }

    public void swim(int b) {
        if (b == 0) {
            System.out.println(name + iName + ".swim(" + b + ");" + ": " + iName + " проплыл " + b + " м");
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
