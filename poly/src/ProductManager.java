public class ProductManager extends  Employee {
    private int bonus;
    public ProductManager(String id, int bonus, String name, int netSalary) {
        super(id, name, netSalary);
        this.bonus=bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary(){
        return getBonus()+getNetSalary();
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "bonus=" + bonus +
                '}';
    }
}
