package itsStart.OOP.Lesson7;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("black", 5.0, "Lincoln");
        Cat cot = new Cat("Red", 5.0, "Jorno");
        System.out.println(cat);
        cat.destroySofa("Линкольна\n");
        String hunt = cot.hunt(true);
        System.out.println("The cat brought the " + hunt);

    }
}
