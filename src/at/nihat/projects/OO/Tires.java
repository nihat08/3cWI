package at.nihat.projects.OO;

public class Tires {
    private int size;
    private String weather;
    private int condition;

    public Tires (int size, String weather, int condition){
        this.size = size;
        this.weather = weather;
        this.condition = condition;
    }

    public Tires() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }


}
