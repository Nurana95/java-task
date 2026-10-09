
public class Main {
    public static void main(String[] args) {

Animal[] animal={
        new Cat("Cat"),
        new Cow("Cow"),
        new Dog("Dog"),
        new Rabbit("Rabbit"),

};
        for (Animal e : animal) {
            System.out.println(e.getSound());
        }

        Employee[] employees={
             new Developer("1","Developer",500,2),
                new ProductManager("2",500,"ProductManager",50 ),
                new Technician("3","Techniciian",850)

        };
        for (Employee e : employees) {
            System.out.println(e.calculateSalary());
        }

Calculator x=new Calculator();
        System.out.println(x.add(5,6));
        System.out.println(x.multiply(5,6));
        System.out.println(x.div(5,6));
        System.out.println(x.multiply(5,6));




    }
}