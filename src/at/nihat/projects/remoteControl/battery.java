package at.nihat.projects.remoteControl;

public class battery {
    private String brand;
    private double chargingStatus;

    public battery(String brand, double chargingStatus) {
        this.brand = brand;
        this.chargingStatus = chargingStatus;
    }


    public void drainBattery(double amount) {
        chargingStatus -= amount;
        if (chargingStatus<0){
            chargingStatus = 0;
        }
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(String chargingStatus) {
        this.chargingStatus = Double.parseDouble(chargingStatus);
    }
}
