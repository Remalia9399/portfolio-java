package basic2.methods;

public class Main05 {

    public static void main(String[] args) {
        System.out.println(calculateNetto(7,0.03));
    }
    public static double calculateNetto(double gross, double vat) {
        double netto = gross - vat;
        return netto;
    }
}
// Perform the calculation: subtract VAT from the gross price to calculate the net price.