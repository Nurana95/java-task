public class Rabbit extends Animal {
    public Rabbit(String sound) {
        super(sound);
    }

    @Override
    public String  makeSound() {
        return getSound();
    }
}
