package resolve;

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
        int plate = 10;
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.iName + " сыт: " + cat.satiety);
            Cat.feedCats(plate, cats);
        }
        System.out.println(Cat.addFoodAtPlate(plate, 7));
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