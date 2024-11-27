package at.nihat.projects.OO;

public class Engine {
    public enum TYPE{Diesel, Gas};
    private int HorsePower;
    private TYPE type;

    public Engine(int HorsePower, TYPE type){
        this.HorsePower = HorsePower;
        this.type = type;
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


    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }




    //public String toString(){
      //  return HorsePower + " hp" + ", " + "Type: " + type;
    //}
}
