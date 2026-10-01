// Animal.java: суперкласс (родитель) для всех животных
public class Animal {
    // protected: видно самому классу и потомкам
    protected String name;
    protected int age;

    // Конструктор родителя: потомки обязаны вызвать его через super(...)
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("[Animal] создан: " + name);
    }

    // Потомки могут переопределить
    public void sound() {
        System.out.println(name + " издаёт какой-то звук");
    }

    // Потомки могут взять как есть
    public void eat() {
        System.out.println(name + " ест");
    }

    // Переопределяем метод класса Object
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name=" + name + ", age=" + age + "}";
    }
}