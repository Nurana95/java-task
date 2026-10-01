// Dog.java: подкласс Animal
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);                              // 1) конструктор родителя
        System.out.println("[Dog] создан: " + name);   // 2) своё тело
    }

    @Override
    public void sound() {
        System.out.println(name + " говорит: Гав!");
    }

    // Только у Dog
    public void fetch() {
        System.out.println(name + " приносит палку");
    }
}