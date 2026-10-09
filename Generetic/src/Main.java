import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        Box<String> box = new Box<>("Salam");
        System.out.println(box.get());
        System.out.println(box.isEmpty());

        box.set(null);
        System.out.println(box.isEmpty());

        Box<Integer> intBox = new Box<>();
        System.out.println(intBox.isEmpty());
        intBox.set(42);
        System.out.println(intBox.get());


        //Pair<K, V>
        //Generic Pair<K, V> sinfi yaz:
        //getKey(), getValue()
        //toString() metodu (açar = dəyər) formatında qaytarsın

        Pair<String, Integer> p1 = new Pair<>("reqem", 31);
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
        System.out.println(p1);

        //3

        Integer[] numbers = {1, 2, 3, 4, 5};
        swap(numbers, 1, 3);
        System.out.println(Arrays.toString(numbers));
//4
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        double sum = sum(intList);
        System.out.println("sum: " + sum);
        //5
        List<Number> my= new ArrayList<>();
        addIntegers(my, 5);
        System.out.println(my);



    }

    //Tapşırıq 4: Wildcard, sum
//List<? extends Number> qəbul edib cəmi double kimi qaytaran metod yaz:
    public static double sum(List<? extends Number> list) {
        double sum=0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
    //5
    public static void addIntegers(List<? super Integer> list, int n) {
        for (int i = 1; i <= n; i++) {
            list.add(i);         }
    }
    public static <T> void swap(T[] arr, int x, int j) {
        T temp = arr[x];
        arr[x] = arr[j];
        arr[j] = temp;

    }

}