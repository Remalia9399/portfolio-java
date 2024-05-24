package oop.constructor;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double addResult = calculator.add(3.0, 0.14);
        System.out.println(addResult);
        System.out.println("calc1 operations -------------");
        calculator.printOperations();
        double addResult2 = calculator.add(40, 2);
        double multiplyResult = calculator.multiply(21, 2);
        System.out.println(multiplyResult);
        System.out.println("calc1 operations -------------");
        calculator.printOperations();







        Calculator calculator2 = new Calculator(); // new Calculator has its own history!
        calculator2.add(22, 11);// this will modify history in calculator2, and NOT in calculator, because history is an instance variable (a "field")
        System.out.println("calc2 operations -------------");
        calculator2.printOperations();
        calculator2.clearOperations();
        System.out.println("calc2 operations -------------");
        calculator2.printOperations();
    }
}
