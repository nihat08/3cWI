package at.nihat.projects.geomet;

public class Rectangle extends Figure{
    private int laenge;
    private int breite;
    public Rectangle(String name, int laenge, int breite) {
        super(name);
        this.laenge = laenge;
        this.breite = breite;
    }
    public int getArea() {
        return laenge * breite;
    }
}
