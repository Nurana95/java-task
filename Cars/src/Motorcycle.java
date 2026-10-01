public class Motorcycle extends Car {

    public String engineVolume;
    public Boolean hasBol;

    public Motorcycle(String millage, String city, Integer price, String year, String model, String brand, String doorCount, String fuelType, String transmission, String engineVolume, Boolean hasBol) {
        super(millage, city, price, year, model, brand, doorCount, fuelType, transmission);
        this.engineVolume = engineVolume;
        this.hasBol = hasBol;
    }

    @Override
    public void  infoshow() {
        System.out.println(brand + " brand name");
    }

    @Override
    public String toString() {
        return "Motocycle{" +
                "engineVolume='" + engineVolume + '\'' +
                ", hasBol=" + hasBol +
                '}';
    }
}
