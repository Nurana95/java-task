public class Dog extends Animal {
    public Dog(String sound) {
        super(sound);
    }

    @Override
    public String  makeSound() {
        return getSound();
    }
}
