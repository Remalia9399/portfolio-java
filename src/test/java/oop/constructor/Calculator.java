package oop.constructor;

import java.util.Arrays;

public class Calculator {
    private String[] history;

    public Calculator() {
        this.history = new String[0];
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        addToHistory(String.format("added %s to %s got %s", num1, num2, result));
        return result;
    }
    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        addToHistory(String.format("multiplied %s with %s got %s", num1, num2, result));
        return result;
    }
    public double divide(double num1, double num2) {
        if (Math.abs(num2 - 0.0) < 0.0000000001) {
            throw new IllegalArgumentException("can NOT divide by zero");
        }
        return num1 / num2; // todo implement add to history
    }
    protected void addToHistory(String operationStrToAdd) {
        this.history = Arrays.copyOf(this.history, this.history.length + 1);
        this.history[this.history.length - 1] = operationStrToAdd;
    }
    public void printOperations() {
        for (String operation : this.history) {
            System.out.println(operation);
        }
    }
    public void clearOperations() {
        this.history = new String[0];
    }
}