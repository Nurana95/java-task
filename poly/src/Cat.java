public class Cat extends Animal {
    public Cat(String sound) {
        super(sound);
    }



    @Override
   public String  makeSound() {
        return getSound();
    }
}
