package basic2.example;

public class ExceptionExample2 {

    public static void main(String[] args) {
        int a = 16;
//        int b = 0;
        int b = -1;
//        int b = 3;

        System.out.println(divide(a, b));

//        try {
//            System.out.println(divide(a, b));
//        } catch (IllegalArgumentException e) {
//            System.out.println("Wyjatek " + e.getMessage());
//        }

    }
    static int divide(int a, int b)  {
        if (b == 0) {
            throw new IllegalArgumentException("cannot be divided by 0");
        }
        if (b == -1) {
            IllegalArgumentException myExceptionInstance = new IllegalArgumentException(" |-1| ");
            throw myExceptionInstance;
        }
        return a / b;
    }
}