package at.nihat.projects.Ex11;

public class main {
    public static void main(String[] args) {

        Engine e1 = new Engine(210, Engine.TYPE.Gas);
        Engine e2 = new Engine(500, Engine.TYPE.Gas);
        Seller s1 = new Seller("audi", "Michael", "Germany", 8);
        Seller s2 = new Seller("BMW", "Albert", "Austria", 3);
        Seller s3 = new Seller("Toyota", "Yu Ming", "Japan", 7);

        Car c1 = new Car("black", 220, 29900, 75000,6, e1, s1);
        Car c2 = new Car("blue", 433, 49200, 30000, 10, e2, s2);

        System.out.println("consumption:" + c1.getConsumption());
        System.out.println(c1.getEngine().getType());
        System.out.println(c1.getSeller().getDiscount());
        System.out.println("price:" + c1.getPrice());

        System.out.println("consumption:" + c2.getConsumption());
        System.out.println(c2.getEngine().getType());
        System.out.println(c2.getSeller().getDiscount());
        System.out.println("price:" + c2.getPrice());

    }
}
