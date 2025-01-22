package at.nihat.projects.remoteControl;

public class Remote {
    private String color;
    private battery battery1;
    private battery battery2;

    public Remote(String color, battery battery1, battery battery2) {
        this.color = color;
        this.battery1 = battery1;
        this.battery2 = battery2;


    }

    public void turnOn(){
        if (battery1.getChargingStatus()>0 && battery2.getChargingStatus()>0){
            System.out.println("Remote Control is on");
            battery1.drainBattery(5);
            battery2.drainBattery(5);
            System.out.println("Battery 1: " + battery1.getChargingStatus());
            System.out.println("Battery 2: " + battery2.getChargingStatus());

        } else {
            System.out.println("Batterie/s is/are empty, RECHARGE!");
        }
    }
    public void turnOff(){
        System.out.println("remote control OFF");
    }
    public void getStatus(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public battery getBattery1() {
        return battery1;
    }

    public void setBattery1(battery battery1) {
        this.battery1 = battery1;
    }

    public battery getBattery2() {
        return battery2;
    }

    public void setBattery2(battery battery2) {
        this.battery2 = battery2;
    }


}
