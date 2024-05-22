package oop.constructor;

public class Burger {
    private String size;
    private double price;
    public Burger() {
        this.size = "medium";
        this.price = 15.99;
    }
    // alt+ins -> menu option "constructor" : constructor generation
    public Burger(String size, double price) {
        this.size = size;
        this.price = price;
    }
    // alt+ins -> menu option "toString" : toString() generation
    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
