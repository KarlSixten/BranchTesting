public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
