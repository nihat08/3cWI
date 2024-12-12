package at.nihat.projects.Ex11;

public class main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        lightElement l1 = new lightElement("light 1", "red", 10);
        lightElement l2 = new lightElement("light 2", "red", 13);

        Engine e1 = new Engine(210, Engine.TYPE.Gas);
        Engine e2 = new Engine(500, Engine.TYPE.Gas);

        Seller s1 = new Seller("audi", "Michael", "Germany", 8);
        Seller s2 = new Seller("BMW", "Albert", "Austria", 3);
        Seller s3 = new Seller("MAN", "Yu Ming", "Japan", 7);

        Truck t1 = new Truck("black", "Trailer 1", 155, 75000,
                100000, 13, e2, s3);

        Car c1 = new Car("black", 220, 29900, 75000,6, e1, s1);
        Car c2 = new Car("blue", 433, 49200, 30000, 10, e2, s2);

        Formula1 f1 = new Formula1("red", 300, 100000, e2, s1);

        Driver d1 = new Driver("michi", 28);



        /*t1.drive();
        t1.stop();
        System.out.println(t1.getTrailer());
*/
        System.out.println(d1);
        d1.addCars(c1);
        d1.addCars(c2);
        d1.printCars();

        System.out.println(t1);
        /*System.out.println("consumption:" + c1.getConsumption());
        System.out.println(c1.getEngine().getType());
        System.out.println(c1.getSeller().getDiscount());
        System.out.println("price:" + c1.getPrice());

        System.out.println("consumption:" + c2.getConsumption());
        System.out.println(c2.getEngine().getType());
        System.out.println(c2.getSeller().getDiscount());
        System.out.println("price:" + c2.getPrice());

        lamp.addLightElement(l1);
        lamp.addLightElement(l2);
        lamp.printNamesOfLightElements();
        lamp.turnAllOn();
        System.out.println("PowerUsage insg.: " + lamp.getOverallPowerUsage());
        */
    }
}
