package basic2.example;

public class PenExample {
    public static void main(String[] args) {
        Pen bluePen = new Pen("blue");
        bluePen.write("ala ma kota");
        Pen greenPen = new Pen("green", 25);
        greenPen.setCapOff();
        greenPen.write("ola ma psa");
        greenPen.setCapOn();

        System.out.println(bluePen.getColor());
        System.out.println(greenPen.getColor());
        String greenPenAsString = greenPen.toString();
        System.out.println(greenPenAsString);
        System.out.println(bluePen.toString());
    }
}
