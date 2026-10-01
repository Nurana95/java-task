public class Car extends Vehicle {
    public String doorCount;
    public String fuelType;
    public String transmission;


    public Car(String millage, String city, Integer price, String year, String model, String brand) {
        super(millage, city, price, year, model, brand);
        this.doorCount = doorCount;
        this.fuelType = fuelType;
        this.transmission = transmission;
    }


    @Override
    public void  infoshow() {
        System.out.println(brand + " brand name");
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount='" + doorCount + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", transmission='" + transmission + '\'' +

                '}';
    }
}