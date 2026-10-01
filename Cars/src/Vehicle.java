public class Vehicle {
    // protected: видно самому классу и потомкам
    public String brand;
    public String model;
    public String year;
    public Integer price;
    public String city;
    public String millage;

    public Vehicle(String millage, String city, Integer price, String year, String model, String brand) {
        this.millage = millage;
        this.city = city;
        this.price = price;
        this.year = year;
        this.model = model;
        this.brand = brand;
    }



    public void  infoshow() {
        System.out.println(brand + " brand name");
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", millage='" + millage + '\'' +
                '}';
    }
}