class Developer extends Employee {
    private double hourlyRate;
    private int hours;

    Developer(String name, double hourlyRate, int hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hours;
    }
}
