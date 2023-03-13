package creational.prototype;

public class Car implements CarI {

    private String id;
    private String name;

    public Car(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public CarI cloneCar() {
        return new Car(this);
    }

    public Car(Car other) {
        this(other.id, other.name);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", name='" + name + "'" +
            "}";
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
