package basic2.methods;

public class Main09 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int fact = 1, i;
        for (i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
}
