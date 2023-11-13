public class Dog extends Animal {

    @Override
    public String makeSound() {
        return "Vov!";
    }
    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
