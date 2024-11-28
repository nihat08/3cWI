package at.nihat.projects.Ex11;

public class Car {
    private String color;
    private int maxSpeed;
    private int price;
    private int consumption;
    private Engine engine;
    private Seller seller;

    public Car(String color, int maxSpeed, int price, int consumption, Engine engine, Seller seller){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.consumption = consumption;
        this.engine = engine;
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}

