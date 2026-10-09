public class Employee
{
    private String id;
    private String name;
    private int netSalary;

    public Employee(String id, String name, int netSalary) {
        this.id = id;
        this.name = name;
        this.netSalary = netSalary;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", netSalary='" + netSalary + '\'' +
                '}';
    }
public int calculateSalary(){
        return getNetSalary();
}
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(int netSalary) {
        this.netSalary = netSalary;
    }
}
