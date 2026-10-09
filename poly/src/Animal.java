public class Animal {
private String sound;

    public Animal(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public String makeSound(){
        return getSound();
    }
    @Override
    public String toString() {
        return "Animal{" +
                "sound='" + sound + '\'' +
                '}';
    }
}
