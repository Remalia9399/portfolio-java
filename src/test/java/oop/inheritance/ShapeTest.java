package oop.inheritance;

public class ShapeTest {

    public static void main(String[] args) {
        Shape s1 = new Shape(0,0,"blue");
        Shape s2 = new Shape(3,4,"green");
        System.out.println(s1.getDescription());
        System.out.println(s2.getDescription());
        double distanceS1toS2 = s1.getDistance(s2);
        System.out.println(distanceS1toS2);
    }
}
