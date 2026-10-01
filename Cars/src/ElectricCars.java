public class ElectricCars extends Car{

    public String batteryCapacity;
    public String range;

    @Override
    public String toString() {
        return "ElectricCars{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", range='" + range + '\'' +
                '}';
    }

    public ElectricCars(String millage, String city, Integer price, String year, String model, String brand) {
        super(millage, city, price, year, model, brand);
        this.batteryCapacity=batteryCapacity;
        this.range=range;

    }
}
