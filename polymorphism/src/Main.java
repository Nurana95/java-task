


public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Əli", 2000, 500),
                new Developer("Leyla", 25, 160),
                new Developer("Rəşad", 30, 120)
        };

        for (Employee e : employees) {
            System.out.println(e.getName() + ": " + e.calculateSalary());
        }
    }
}