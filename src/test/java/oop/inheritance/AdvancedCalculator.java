package oop.inheritance;

import oop.constructor.Calculator;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator {

    public double pow(double num1, double num2) {
        double result = Math.pow(num1 , num2);
        String operationStr = String.format("%s ^ %s equals %s", num1, num2, result);
        this.history = Arrays.copyOf(this.history, this.history.length + 1);
        this.history[this.history.length - 1] = operationStr;
        return result;
    }
    public double root(double num1, double num2) {
        double result = Math.pow(num1 , 1/num2);
        String operationStr = String.format("%s root of %s equals %s", num1, num2, result);
        this.history = Arrays.copyOf(this.history, this.history.length + 1);
        this.history[this.history.length - 1] = operationStr;
        return result;
    }

    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator= new AdvancedCalculator();

        double equals = advancedCalculator.pow(3, 2);
        equals = advancedCalculator.pow(3,2);
        equals = advancedCalculator.pow(3,3);
        equals = advancedCalculator.pow(3,4);

        double root = advancedCalculator.root(3, 2);
        root = advancedCalculator.root(3,2);
        root = advancedCalculator.root(3,3);
        root = advancedCalculator.root(3,4);


        for (String s: printOperations()) {
            System.out.println(s);
        }
    }
}