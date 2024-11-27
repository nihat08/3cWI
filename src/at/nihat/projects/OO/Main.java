package at.nihat.projects.OO;

import static at.nihat.projects.OO.Engine.TYPE.Diesel;
import static at.nihat.projects.OO.Engine.TYPE.Gas;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine(187, Diesel);
        Engine engine2 = new Engine(200, Gas);
        Car c1 = new Car(150, 70, 7, "BMW", "A1234", "red", engine1);
        Car c2 = new Car(100, 20, 7, "Audi", "B1234", "black", engine2);

        System.out.println(c1.getEngine().getHorsePower());
        System.out.println(c2.getEngine().getHorsePower());




       /* c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A1234");
        c1.setFuelAmount(70);
        c1.setFuelCapacity(100);
        c1.setBreakSpeed(5);
        Car c2 = new Car();
        c2.setBrand("BMW");
        c2.setFuelConsumption(7);
        c2.setSerialNumber("B1234");
        c2.setFuelAmount(20);
        c2.setFuelCapacity(100);
        c2.setBreakSpeed(5);



        RearMirror m1 = new RearMirror(100, -5);
        RearMirror m2 = new RearMirror(85, 10);
        RearMirror m3 = new RearMirror(85, -10);
        c1.addMirror(m1);
        c2.addMirror(m2);
        c2.addMirror(m3);
        System.out.println("Mirror Position: " + c2.getMirrors().get(0).getPosition());

        Tires t1 = new Tires(21, "summer", 4);
        c1.addTires(t1);
        System.out.println("Tire size: " + c1.getTires().get(0).getSize());



        c1.getTurboBoost();
        c2.getTurboBoost();

        c1.getRemainingRange();
        c2.getRemainingRange();

        c1.getBreakk();
        System.out.println(c1.getSpeed());
        c2.getBreakk();

*/
    }
    }


