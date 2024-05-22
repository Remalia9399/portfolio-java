package oop.inheritance;

import oop.inheritance.Shape;
public class Circle extends Shape {
    public double radius;

    @Override
    public String getDescription() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", radius='" + radius + '\'' +
                '}';
    }
    public Circle(double x, double y, String color, double radius) {
//        super(x, y, color);
        super(x, y, color);
        this.radius = radius;
    }
    public double getArea(Circle other) {
//        return other.x * this.y;
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircuit(Circle other) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(0,0,"blue", 93.5);
        Circle c2 = new Circle(3,4,"green", 123.1);
        System.out.println(c1.getDescription());
        System.out.println(c2.getDescription());
        double distanceC1toC2 = c1.getDistance(c2);
        System.out.println(distanceC1toC2);

        double getAreaC1 = c1.getArea(c1);
        double getAreaC2 = c2.getArea(c2);
        System.out.println("Pole 1: " + getAreaC1 + " Pole 2: " + getAreaC2);

        double getCircuitC1 = c1.getCircuit(c1);
        double getCircuitC2 = c2.getCircuit(c2);
        System.out.println("Obwód 1: " + getCircuitC1 + " Obwód 2: " + getCircuitC2);
    }
}