package at.nihat.projects.Ex11;

public class main {
    public static void main(String[] args) {

        Engine e1 = new Engine(210, Engine.TYPE.Gas);
        Seller s1 = new Seller("audi", "Michael", "Germany", 5);
        Seller s2 = new Seller("BMW", "Albert", "Austria", 3);
        Seller s3 = new Seller("Toyota", "Yu Ming", "Japan", 7);

        Car c1 = new Car("black", 220, 29900, 5, e1, s1);
        System.out.println(c1.getEngine().getType());
        System.out.println(c1.getSeller().getDiscount());
    }
}
