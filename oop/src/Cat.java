// Cat.java: подкласс Animal
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
        System.out.println("[Cat] создан: " + name);
    }

    @Override
    public void sound() {
        System.out.println(name + " говорит: Мяу!");
    }

    @Override
    public void eat() {
        super.eat();   // сначала версия родителя
        System.out.println("  ...и потом умывается");
    }
}