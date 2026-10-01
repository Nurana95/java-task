public class Truck extends Vehicle {
    public String loadCapacity;
    public String axleCount;
    public Truck(String millage, String city, Integer price, String year, String model, String brand) {
        super(millage, city, price, year, model, brand);
        this.loadCapacity = loadCapacity;
        this.axleCount = axleCount;
    }


    @Override
    public void  infoshow() {
        System.out.println(brand + " brand name");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity='" + loadCapacity + '\'' +
                ", axleCount='" + axleCount + '\'' +
                '}';
    }
}