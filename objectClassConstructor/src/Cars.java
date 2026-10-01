public class Cars {
    public Integer id;
    public String city;
    public String model;
    public Integer year;
    public String type;
    public String color;
    public String speed;
    public String engine;
    public String typeOfRoof;
    public Integer numberOfSeats;
    public Boolean newOld=true;


    public Cars(Integer id, String city, String model, Integer year, String type, String color, String speed, String engine, String typeOfRoof, Integer numberOfSeats, Boolean newOld) {
        this.id = id;
        this.city = city;
        this.model = model;
        this.year = year;
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.engine = engine;
        this.typeOfRoof = typeOfRoof;
        this.numberOfSeats = numberOfSeats;
        this.newOld = newOld;
    }


    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", speed='" + speed + '\'' +
                ", engine='" + engine + '\'' +
                ", typeOfRoof='" + typeOfRoof + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", newOld=" + newOld +
                '}';
    }
}
