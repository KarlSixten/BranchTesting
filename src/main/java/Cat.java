public class Cat extends Animal {

    @Override
    public String makeSound() {
        return "Miav!";
    }
    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void mood(Boolean isHappy) {
        if (isHappy) {
            System.out.println("Spinder");
        } else {
            System.out.println("Hvæser");
        }
    }

    @Override
    public void jump(double distance) {

    }
}
