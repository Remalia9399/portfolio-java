package basic2.example;

public class Pen
//        extends Object // every class directly or indirectly extends class Object
{
    public static final String DEFAULT_COLOR = "blue";
    private static final String[] VALID_COLORS = {DEFAULT_COLOR, "green", "yellow", "white"};
    public static final boolean DEFAULT_IS_CAP_ON = true;
    private static final int DEFAULT_WEIGHT = 20;

    private String color;
    private int weightInGrams;
    private boolean isCapOn = DEFAULT_IS_CAP_ON;

    public Pen(String color) {
        setColor(color);
        setWeightInGrams(DEFAULT_WEIGHT);
    }

    public Pen(String color, int weightInGrams) {
        setColor(color);
        setWeightInGrams(weightInGrams);
    }

    public void write(String text) {
        if (this.isCapOn) {
            return;
        }
        System.out.println("writing in " + this.color + ": " + text);
    }

    private void setColor(String color) {
        for(String validColor : VALID_COLORS) {
            if (validColor.equals(color)) {
                this.color = color;
                return;
            }
        }
        throw new IllegalArgumentException("invalid color: " + color);
    }

    public String getColor() {
        return this.color;
    }

    private void setWeightInGrams(int weightInGrams) {
        if (weightInGrams < 1) {
            throw new IllegalArgumentException("invalid weight: " + weightInGrams);
        }
        this.weightInGrams = weightInGrams;
    }

    public void setCapOn() {
        isCapOn = true;
    }

    public void setCapOff() {
        isCapOn = false;
    }

    @Override
    public String toString() { // overriding
        return "Pen: color=" + this.color +
                ", isCapOn=" + this.isCapOn;
    }
}
