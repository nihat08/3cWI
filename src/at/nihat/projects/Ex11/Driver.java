package at.nihat.projects.Ex11;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public List<Car> cars = new ArrayList<Car>();
    private String name;
    private int age;

    public Driver(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return age + "\n" + name + "\n" + cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addCars(Car car){
        cars.add(car);
    }

    public void printCars(){
        System.out.println(name + " owns these cars");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
