package basic2.exceptions;


public class Main06 {

    public static void main(String[] args) {

        try {
            int zm = divide(3, 0);
            System.out.println(zm);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new IllegalArgumentException("cannot be divided by 0");
        }
        return a / b;
    }
}
