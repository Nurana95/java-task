import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Ali");
        students.put(102, "Vali");
        students.put(103, "Aysel");
        students.put(104, "Nigar");
        students.put(102, "Elvin");

        System.out.println(students.get(102));

        System.out.println( students.get(103));

        System.out.println(students.getOrDefault(999, "Tapılmadı 999"));

        System.out.println(students.containsKey(105));

        System.out.println("Silinən tələbə (101): " + students.remove(101));

        System.out.println("Olmayan açarı (500) silməyin nəticəsi: "
                + students.remove(985));

        System.out.println("Size " + students.size());

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Açar: " + entry.getKey() + " -> Dəyər: "
                    + entry.getValue());
        }
    }
}