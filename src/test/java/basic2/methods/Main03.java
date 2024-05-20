package basic2.methods;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main03 {

    public static void main(String[] args) {
        double pln = convertToUsd(6);
        System.out.println(pln);
    }

    public static double convertToUsd(double pln) {
        double usd = pln / 4.04;
        BigDecimal USD = new BigDecimal(usd);
        USD = USD.setScale(2, RoundingMode.HALF_UP);
        return USD.doubleValue();
    }
}
