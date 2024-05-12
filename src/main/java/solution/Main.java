package solution;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("cat");
        Animal animal2 = new Animal("dog");
        Cat cat1 = new Cat("cat", "Barsik", false);
        Cat cat2 = new Cat("cat", "Tusik", false);
        Dog dog = new Dog("dog", "Reks");
        cat1.run(150);
        dog.run(150);
        cat1.swim(0);
        dog.swim(3);
        System.out.println(Animal.getcount() + "animals");
        System.out.println(Cat.getcount() + "cats");
        System.out.println(Dog.getcount() + "dogs");
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("cat", "Bars", false);
        cats[1] = new Cat("cat", "Kotik", false);
        cats[2] = new Cat("cat", "Ryzhyk", false);
        int plate=10;
        for (Cat cat : cats) {
            System.out.println("Кот "+cat.iname+" сыт: "+cat.satiety);
            Cat.feedCats(plate, cats);
        }
        System.out.println(Cat.addFoodAtPlate(plate,7));
        Circle circle = new Circle(3);
        circle.setFillColor("White");
        circle.setBorderColor("Black");
        circle.printFeatures();
        Rectangle rectangle = new Rectangle(2, 2);
        rectangle.setFillColor("Red");
        rectangle.setBorderColor("Yellow");
        rectangle.printFeatures();
        Triangle triangle = new Triangle(3, 3, 4);
        triangle.setFillColor("Blue");
        triangle.setBorderColor("Pink");
        triangle.printFeatures();
}
}
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
interface Form{
    default double calculatePerimeter(){
        return 0;
    }
    default double calculateArea(){
        return 0;
    }
}
interface Fillin {
    void setFillColor(String color);
}
interface Bordercolored{
    void setBorderColor(String color);
}
class Circle implements Form, Fillin, Bordercolored{
    private double radius;
    private String fillColor;
    private String borderColor;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public void setFillColor(String color){
        this.fillColor=color;
    }
    public void setBorderColor(String color){
        this.borderColor=color;
    }
    public void printFeatures() {
        System.out.println("Circle:");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill color: " + fillColor);
        System.out.println("Border color: " + borderColor);
    }
}
class Rectangle implements Form, Fillin, Bordercolored {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    public void setFillColor(String color) {
        this.fillColor = color;
    }
    public void setBorderColor(String color) {
        this.borderColor = color;
    }
    public void printFeatures() {
        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill color: " + fillColor);
        System.out.println("Border color: " + borderColor);
    }
}
class Triangle implements Form, Fillin, Bordercolored {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }
    public void setFillColor(String color) {
        this.fillColor = color;
    }
    public void setBorderColor(String color) {
        this.borderColor = color;
    }
    public void printFeatures() {
        System.out.println("Triangle:");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill color: " + fillColor);
        System.out.println("Border color: " + borderColor);
    }
}





