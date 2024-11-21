package at.nihat.projects.OO;

import static at.nihat.projects.OO.Engine.TYPE.Diesel;
import static at.nihat.projects.OO.Engine.TYPE.Gas;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A1234");
        c1.setFuelAmount(70);
        c1.setFuelMaxAmount(100);
        c1.setBreakSpeed(5);
        Car c2 = new Car();
        c2.setBrand("BMW");
        c2.setFuelConsumption(7);
        c2.setSerialNumber("B1234");
        c2.setFuelAmount(20);
        c2.setFuelMaxAmount(100);
        c2.setBreakSpeed(5);

        Engine ec1 = new Engine(187, Diesel, 200);
        System.out.println(ec1.getFuelCap());
        ec1.setFuelCap(50);
        System.out.println(ec1.getFuelCap());

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

        System.out.println(c2.getFuelAmount());
        c2.getDrive();
        System.out.println(c1.getFuelAmount());

        c1.getTurboBoost();
        c2.getTurboBoost();

        c1.getRemainingRange();
        c2.getRemainingRange();

        c1.getBreakk();
        System.out.println(c1.getSpeed());
        c2.getBreakk();


    }
    }


