package oop.inheritance;

import oop.constructor.Calculator;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator {
    //pow(num1, num2) – metoda ma zwracać num1 do potęgi num2.
// Dodatkowo w tablicy operacji ma zapamiętać napis: "num1^num2 equals result".
    public double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        addToHistory(String.format("%s^%s equals %s", num1, num2, result));
        return result;
    }
    //root(num1, num2) – metoda ma wyliczyć pierwiastek num2 stopnia z num1.
// Dodatkowo w tablicy operacji ma zapamiętać napis: "num2 root of num1 equals result".
    public double root(double num1, double num2) {
        double result = Math.pow(num1, 1/num2);
        addToHistory(String.format("%s root of %s equals %s", num2, num1, result));
        return result;
    }
}