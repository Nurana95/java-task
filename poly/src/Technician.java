public class Technician extends Employee{
    public Technician(String id, String name, int netSalary) {
        super(id, name, netSalary);
    }
    @Override
    public int calculateSalary(){
        return (getNetSalary()/2);
    }
}
