package at.nihat.projects.OO;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A1234");
        c1.setFuelAmount(70);
        c1.setFuelMaxAmount(100);
        c1.setSpeed(50);
        c1.setBreakSpeed(5);

        Car c2 = new Car();
        c2.setBrand("BMW");
        c2.setFuelConsumption(7);
        c2.setSerialNumber("B1234");
        c2.setFuelAmount(20);
        c2.setFuelMaxAmount(100);
        c2.setSpeed(45);
        c2.setBreakSpeed(5);




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


