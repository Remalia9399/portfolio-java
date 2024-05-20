package basic2.methods;

public class Main06 {

    public static void main(String[] args) {
        boolean age = checkMaturity(41);
        System.out.println(age);
    }
    public static boolean checkMaturity(int age) {
        boolean maturity = false;
        if (age >= 18)
            maturity = true;
        return maturity;
    }
}
