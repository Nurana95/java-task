import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
Task1 :List<Integer> verilir. Yalnız cüt ədədləri seç, hər birinin kvadratını al və nəticəni yeni siyahıya yığ.
Nümunə: [1, 2, 3, 4, 5, 6] → [4, 16, 36]
*/
        List<Integer> map= Arrays.asList(1,2,3,4,5,6,8);
List<Integer> filter=map.stream()
        .filter(n->n%2==0)
        .map(n->n*n)
        .collect(Collectors.toList());
        System.out.println(filter);

       // Task2 :List<String> formatında sözlər verilir. Uzunluğu 3-dən
        // böyük olanları seç, uzunluğa görə azalan sırada düz və
        // ilk 3-nü qaytar. Təkrarlananları çıxar (distinct).

        List<String> map1 = Arrays.asList("alma", "nar",
                "heyva", "gilas", "albalı",
                "alma", "armud", "gilas");
        List<String> filter1= map1.stream()
                .filter(n->n.length()>3)
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(filter1);
        //Task3 :Employee sinfi var: name, department, salary, age.
        //Bu siyahıdan:
        //ən yüksək maaşlı işçini tap (Optional ilə),
        //bütün işçilərin orta maaşını hesabla,
        //yaşı 30-dan böyük olanların ümumi maaş cəmini tap.
        List<Employee> employees = Arrays.asList(
                new Employee("Anar", "IT", 2500.0, 28),
                new Employee("Leyla", "HR", 1800.0, 32),
                new Employee("Orxan", "IT", 3200.0, 35),
                new Employee("Aysel", "Finance", 2200.0, 26),
                new Employee("Elmir", "IT", 1500.0, 23)
        );
        Optional<Employee> stream1 = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        OptionalDouble averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average();
        double sumSalaryOver30 = employees.stream()
                .filter(n->n.getAge()>=30)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Yaşı 30-dan böyük olanların ümumi maaş cəmi: "
                + sumSalaryOver30 + " AZN");

        //Task4 :Eyni Employee siyahısından:
        //işçiləri department-ə görə qruplaşdır (Map<String, List<Employee>>),
        //hər departamentdə neçə işçi olduğunu çıxar (Map<String, Long>),
        //hər departamentin orta maaşını tap.
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeesByDept);
        Map<String, Long> employeeCountByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        Map<String, Double> employeeSum = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Orta maaş: " + employeeSum);
        /*
        Task 5 :List<String> e-poçt ünvanları verilir (təkrarlananlar var).
        Bunları et:
        hamısını kiçik hərfə çevir,
        @gmail.com ilə bitənləri seç,
                təkrarları sil,
                neçə unikal Gmail ünvanı olduğunu count() ilə tap.*/

        List<String> emails = Arrays.asList(
                "Test.User@Gmail.com",
                "admin@yahoo.com",
                "test.user@gmail.com",
                "user123@GMAIL.COM",
                "hello@gmail.com",
                "Test.User@Gmail.com"
        );
        long uniqueGmailCount = emails.stream()
                .map(String::toLowerCase)
                .filter(e -> e.endsWith("@gmail.com"))
                .distinct()
                .count();

        System.out.println("Gmail ünvanlarının sayı: " + uniqueGmailCount);

//Task 6 : List<String> tələbə adları verilir. Hər adı yeni sətirdə "Tələbə: <ad>" formatında çap et (forEach və method reference ilə: System.out::println).
//Nümunə: ["Aysel", "Orxan", "Leyla"] → Tələbə: Aysel, Tələbə: Orxan, Tələbə: Leyla

        List<String> students = Arrays.asList("Aysel", "Orxan", "Leyla");

        students.stream()
                .map(name -> "Tələbə: " + name)
                .forEach(System.out::println);
//Task 7: List<Integer> verilir. Yalnız 10-dan böyük ədədləri seç
// və hər birini "Ədəd: 15" formatında çap et.
//Nümunə: [5, 12, 8, 15, 20] → Ədəd: 12, Ədəd: 15, Ədəd: 20
        List<Integer> numbers = Arrays.asList(5, 12, 8, 15, 20);
            List<String> names = List.of();
            System.out.println(names+"kgkgk");


            numbers.stream()
                .filter(n -> n > 10)
                .map(n -> "Ədəd: " + n)
                .forEach(System.out::println);
//Task 8: Map<String, Integer> verilir (açar: fənn adı, dəyər: qiymət).
// forEach((key, value) -> ...)
// ilə hər cütü "Riyaziyyat -> 90" formatında çap et.
        Map<String, Integer> qiymetler = new HashMap<>();
        qiymetler.put("Riyaziyyat", 90);
        qiymetler.put("Fizika", 85);
        qiymetler.put("Kimya", 78);
        qiymetler.put("Ədəbiyyat", 92);
        qiymetler.forEach((key, value) -> System.out.println(key + " -> " + value));

    }}



