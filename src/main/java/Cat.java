public class Cat extends Animal {

    @Override
    public String makeSound() {
        return "Miav!";
    }
    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
