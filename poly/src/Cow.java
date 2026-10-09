public class Cow extends Animal {

    public Cow(String sound) {
        super(sound);
    }

    @Override
    public String  makeSound() {
        return getSound();
    }
}
