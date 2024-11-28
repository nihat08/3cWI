package at.nihat.projects.Ex11;

public class Engine {
    public enum TYPE {Diesel, Gas};
    private int HorsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        HorsePower = horsePower;
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
