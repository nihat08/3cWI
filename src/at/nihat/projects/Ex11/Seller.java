package at.nihat.projects.Ex11;

public class Seller {
    private String brand;
    private String name;
    private String country;
    private int discount;

    public Seller(String brand, String name, String country, int discount) {
        this.brand = brand;
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getDiscount() {
        return discount;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
