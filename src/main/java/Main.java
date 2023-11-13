public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());

        dog.eat("Dog food");
        cat.eat("Cat food");

        dog.mood(true);
        cat.mood(false);
        System.out.println("Hello main method");
    }
}
