package basic2.example;

public class ClassPen {
    public static final String DEFAULT_COLOR = "blue";
    public static final boolean DEFAULT_IS_CAP_ON = true;

    public String color;
    public int weightInGrams;
    public boolean isCapOn = DEFAULT_IS_CAP_ON;

    public void write(String text) {
        if (this.isCapOn) {
            return;
        }
        System.out.println("writing in " + this.color + ": " + text);
    }
}
