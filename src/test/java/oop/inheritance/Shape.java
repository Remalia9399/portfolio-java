package oop.inheritance;

public class Shape {
    double x;
    double y;
    String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //a method called getDescription(),
    // printing information about this shape,
    // returning a String value,
    //metodę o nazwie getDescription(),
    // wypisującą informacje o tym kształcie,
    // zwracającą wartość typu String,

    public String getDescription() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    //method called getDistance(Shape shape),
    // returning the distance from the center of another shape,
    // the result should be of type double.

    //metodę o nazwie getDistance(Shape shape),
    // zwracającą odległość od środka innego kształtu,
    // wynik ma być typu double.
    public double getDistance(Shape other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        double dx2 = dx * dx;
        double dy2 = dy * dy;
        return Math.sqrt(dx2 + dy2);
    }
}
