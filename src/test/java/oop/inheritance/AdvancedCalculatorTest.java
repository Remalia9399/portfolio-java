package oop.inheritance;

public class AdvancedCalculatorTest {
    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        ac.add(3, 4);
        double pow2To8 = ac.pow(2, 8);
        ac.root(pow2To8, 8);
        ac.printOperations();
    }
}