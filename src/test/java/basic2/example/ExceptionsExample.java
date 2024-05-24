package basic2.example;

public class ExceptionsExample {
    public static void main(String[] args) {
        double num1 = 2;
        double num2 = 3;
        double result = add(num1, num2);
        System.out.println(result); // A BUG!

        // exception
//        System.out.println(3/0); // java.lang.ArithmeticException
        int[] arr = {};
//        System.out.println(arr[2]); // java.lang.ArrayIndexOutOfBoundsException
        try {
            int div1 = divide(3, 4);
            System.out.println(div1);
            int div2 = divide(3, 0);
            System.out.println(div2);
        } catch (Exception e) {
            System.out.println("exception occurred: " + e.getMessage());
        }
        System.out.println("end of program");
    }

    public static double add(double a, double b) {
        return a - b; // this is a BUG!
    }

    public static int divide(int a, int b) throws Exception { // checked exception example
        if (b == 0) {
            throw new Exception("cannot be divided by 0");
        }
        return a / b;
    }
    public static void showLength(String s) {
        if(s!=null) {
            System.out.println(s.length());
        }
    }
}
