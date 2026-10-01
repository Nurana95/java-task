// Flyable.java: интерфейс «умеет летать»
public interface Flyable {
    void fly();   // обязателен для реализации

    // default-метод: готовая реализация (с Java 8)
    default void land() {
        System.out.println("  ...приземлился.");
    }
}