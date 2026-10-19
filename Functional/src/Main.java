import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    // Task 1
    static <T> List<T> filter(List<T> list, Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // Task 2
    static <T, R> List<R> myMap(List<T> list, Function<T, R> mapper) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(mapper.apply(item));
        }
        return result;
    }


    static <T> void myForEach(List<T> list, Consumer<T> action) {
        for (T item : list) {
            action.accept(item);
        }
    }

    static <T, R> R myReduce(List<T> list, R identity, BiFunction<R, T, R> combiner) {
        R result = identity;
        for (T item : list) {
            result = combiner.apply(result, item);
        }
        return result;
    }
    //task 3
    @FunctionalInterface
    interface MyPredicate<T> {
        boolean test(T t);
    }

    @FunctionalInterface
    interface MyFunction<T, R> {
        R apply(T t);
    }

    @FunctionalInterface
    interface MyConsumer<T> {
        void accept(T t);
    }

    @FunctionalInterface
    interface MySupplier<T> {
        T get();
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(filter(numbers, n -> n % 2 == 0));
        List<String> names = List.of("Ali", "Vəli", "Aysel");
        System.out.println(filter(names, s -> s.startsWith("A")));

        System.out.println(filter(new ArrayList<String>(), s -> true));

        System.out.println(myMap(List.of("java", "lambda"), s -> s.length()));

        myForEach(names, s -> System.out.println("Salam, " + s));

        List<Integer> nums = List.of(1, 2, 3, 4);
        System.out.println(myReduce(nums, 0, (a, b) -> a + b));        // 10
        System.out.println(myReduce(nums, 1, (a, b) -> a * b));

        MyPredicate<Integer> cut = n -> n % 2 == 0;
        MyPredicate<Integer> boyuk = n -> n > 10;

        System.out.println("4 cütdür? " + cut.test(4));
        System.out.println("12 > 10-dur? " + boyuk.test(12));
    }
}