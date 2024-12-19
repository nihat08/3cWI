package at.nihat.projects.geomet;

public class Circle extends Figure{
    private int radius;
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));

    }

}
