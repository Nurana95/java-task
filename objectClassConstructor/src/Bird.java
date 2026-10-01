// Bird.java: наследует класс Animal и реализует интерфейс Flyable
public class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age);
        System.out.println("[Bird] создан: " + name);
    }

    @Override
    public void sound() {
        System.out.println(name + " говорит: Чирик!");
    }

    @Override
    public void fly() {
        System.out.println(name + " летит");
    }
}