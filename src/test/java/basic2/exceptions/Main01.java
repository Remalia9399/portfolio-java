package basic2.exceptions;


public class Main01 {

    public static void main(String[] args) {

        try {
            System.out.println(factorial(3));
            System.out.println(factorial(-3));
        } catch (IllegalArgumentException e) {
            System.out.println("exception: " + e.getMessage());
        }
        System.out.println("end of program");

    }

    static int factorial(int number) {
        if (number < 0) {
            IllegalArgumentException myExceptionInstance = new IllegalArgumentException("factorial is only defined for input >= 0, but was: " + number);
            throw myExceptionInstance;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
