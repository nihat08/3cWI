package at.nihat.projects.Ex11;

public class Car {
    private String color;
    private int maxSpeed;
    private int price;
    private double consumption;
    private int mileage;
    private Engine engine;
    private Seller seller;

    public Car(String color, int maxSpeed, int price, int mileage, int consumption, Engine engine, Seller seller){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.mileage = mileage;
        this.consumption = consumption;
        this.engine = engine;
        this.seller = seller;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage=mileage;
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
        int discountPrice = (int) (this.price * (1 - (this.seller.getDiscount() /100.0)));
        return discountPrice;
    }

    public double getConsumption() {
        if (mileage > 50000) {
            return (consumption * 1.098);
        } else {
            return consumption;
        }
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
        if (mileage>50000) {
            System.out.println(consumption * 1.098);
        } else {
            this.consumption=consumption;
        }
    }
    public void drive(){
        System.out.println("I am driving");
    }
    public void stop(){
        System.out.println("I am stopping ............ car");
    }

    @Override
    public String toString() {
        return this.seller.getBrand() + " - " + this.seller.getName() + " m:" + this.mileage;
    }
}

