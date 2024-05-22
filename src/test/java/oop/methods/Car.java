package oop.methods;

public class Car {

    String brand;
    String model;
    int price;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getPrice(int price) {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    void getFullName(String brand, String surname) {
        System.out.println(String.join(" ",this.brand ,this.model));
    }
}


