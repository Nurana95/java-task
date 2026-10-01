// Zoo.java: точка входа программы. Здесь только main, который использует остальные классы.
public class Zoo {
    public static void main(String[] args) {
        System.out.println("=== 1. Порядок вызова конструкторов ===");
        Dog rex = new Dog("Рекс", 3);

        System.out.println("\n=== 2. Унаследованный и собственный методы ===");
        rex.eat();      // унаследован от Animal
        rex.fetch();    // есть только у Dog

        System.out.println("\n=== 3. Полиморфизм ===");
        Animal[] zoo = {
                rex,
                new Cat("Мурка", 2),
                new Bird("Кеша", 1)
        };
        System.out.println();
        for (Animal a : zoo) {
            a.sound();  // версия выбирается по реальному типу объекта
        }

        System.out.println("\n=== 4. Переопределение с вызовом super ===");
        zoo[1].eat();

        System.out.println("\n=== 5. instanceof и приведение типа ===");
        for (Animal a : zoo) {
            System.out.println(a);
            if (a instanceof Flyable) {
                Flyable f = (Flyable) a;
                f.fly();
                f.land();
            }
            if (a instanceof Dog) {
                ((Dog) a).fetch();
            }
        }

        System.out.println("\n=== 6. Проверки IS-A ===");
        Animal kesha = zoo[2];
        System.out.println("Кеша instanceof Animal:  " + (kesha instanceof Animal));
        System.out.println("Кеша instanceof Bird:    " + (kesha instanceof Bird));
        System.out.println("Кеша instanceof Flyable: " + (kesha instanceof Flyable));
        System.out.println("Кеша instanceof Dog:     " + (kesha instanceof Dog));
        System.out.println("Кеша instanceof Object:  " + (kesha instanceof Object));
    }
}