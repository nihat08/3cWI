package at.nihat.projects.OO;

public class Engine {
    public enum TYPE{Diesel, Gas};
    private int HorsePower;
    private TYPE type;
    private int FuelCap;

    public Engine(int HorsePower, TYPE type, int FuelCap){
        this.HorsePower = HorsePower;
        this.type = type;
        this.FuelCap = FuelCap;
    }

    public void drive(int amount) {
        System.out.println("the engine is running with " + amount + " L fuel");
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public TYPE getType(TYPE diesel) {
        return type;
    }

    public int getFuelCap() {
        if (FuelCap > 100) {
            this.FuelCap = 100;
        } else {
            this.FuelCap = FuelCap;
        }
        return FuelCap;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public void setFuelCap(int fuelCap) {

        FuelCap = fuelCap;
    }



    //public String toString(){
      //  return HorsePower + " hp" + ", " + "Type: " + type;
    //}
}
