package at.nihat.projects.Ex11;

public class Truck extends Car{
    private String trailer;
    public Truck(String color, String trailer, int maxSpeed, int price, int mileage, int consumption, Engine engine, Seller seller) {
        super(color, maxSpeed, price, mileage, consumption, engine, seller);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
