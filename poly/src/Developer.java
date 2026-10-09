public class Developer extends Employee {
    private int perHour;

    public Developer(String id, String name, int netSalary, int perHour) {
        super(id, name, netSalary);
        this.perHour = perHour;
    }



    public int getPerHour() {
        return perHour;
    }

    public void setPerHour(int perHour) {
        this.perHour = perHour;
    }


    public int calculateSalary(){
        return getNetSalary()+perHour;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "perHour=" + perHour +
                '}';
    }
}
