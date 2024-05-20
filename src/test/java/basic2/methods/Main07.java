package basic2.methods;

public class Main07 {

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(7));
    }
    public static String checkEvenOdd(int number) {
        number = number % 2;
        String evenOdd = "";
        if (number == 0 ) {
            evenOdd = "even";
        } else evenOdd = "odd";
        return evenOdd;
    }
}
