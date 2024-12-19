package at.nihat.projects.geomet;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("c1", 8);
        Circle c2 = new Circle("c2", 10);
        System.out.println(c1.getArea());


        System.out.println(c1.getName());


        Rectangle r1 = new Rectangle("r1", 10, 15);
        System.out.println(r1.getArea());
    }}
