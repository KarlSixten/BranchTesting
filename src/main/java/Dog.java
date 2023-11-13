public class Dog extends Animal {

    @Override
    public String makeSound() {
        return "Vov!";
    }
    @Override
    public boolean eat(String foodType) {
        return true;
    }
    @Override
    public void mood(Boolean isHappy) {
        if (isHappy) {
            System.out.println("Logrer");
        } else {
            System.out.println("Knurrer");
        }
    }
}
