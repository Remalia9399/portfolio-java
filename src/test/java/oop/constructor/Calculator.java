package oop.constructor;

import java.util.Arrays;

public class Calculator {
    public static String [] history;


    public Calculator () {
        this.history = new String[0];
    }
    public double add (double num1,double num2) {
        double result = num1 + num2;
        String operationStr = String.format("added %s to %s got %s", num1, num2, result);
        this.history = Arrays.copyOf(this.history, this.history.length + 1);
        this.history [this.history.length - 1] = operationStr;
        return result;
    }
    public double multiply (double num1,double num2) {
        double result = num1 * num2;
        String operationStr = String.format("multiplied %s with %s got %s", num1, num2, result);
        this.history = Arrays.copyOf(this.history, this.history.length + 1);
        this.history [this.history.length - 1] = operationStr;
        return result;
    }
    public double subtract (double num1,double num2) {
        double result = num1 - num2;
        String operationStr = String.format("subtracted %s from %s got %s", num1, num2, result);
        this.history = Arrays.copyOf(this.history, this.history.length + 1);
        this.history [this.history.length - 1] = operationStr;
        return result;
    }
    public double divide (double num1,double num2) {
//        double result = num1 / num2;
        double result;
        if (num2 != 0) {
            result = num1 / num2;
        } else
            result = 0;
        String operationStr = String.format("divided %s by %s got %s", num1, num2, result);
        this.history = Arrays.copyOf(this.history, this.history.length + 1);
        this.history [this.history.length - 1] = operationStr;
        return result;
    }
    //    private static String getHistory() { return history[1]; }
    public static String[] printOperations() {
        return Arrays.copyOf(history, history.length);

    }
    private static void clearOperations() {
        for (int i = 1; i < history.length; i++)
            history[i] = null;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        System.out.println(addResult);
//        System.out.println(getHistory());

        double addResult = calculator.add(3.0, 0.14);
        addResult = calculator.add(3,2);
        addResult = calculator.add(3,3);
        addResult = calculator.add(3,4);

        double multiply = calculator.multiply(3.0, 0.14);
        multiply = calculator.multiply(3,2);
        multiply = calculator.multiply(3,3);
        multiply = calculator.multiply(3,4);

        double subtracted = calculator.subtract(3.0, 0.14);
        subtracted = calculator.subtract(3,2);
        subtracted = calculator.subtract(3,3);
        subtracted = calculator.subtract(3,4);

        double divide = calculator.divide(3.0, 0.14);
        divide = calculator.divide(3,2);
        divide = calculator.divide(3,3);
        divide = calculator.divide(3,4);
        divide = calculator.divide(3,0);

        for (String s: printOperations()) {
            System.out.println(s);
        }
        clearOperations();
        for (String s: printOperations()) {
            System.out.println(s);
        }
    }
}