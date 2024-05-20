package basic2.exceptions;


public class Main05 {

    public static void main(String[] args) {

        try {
            int num2 = Integer.parseInt("1");
            System.out.println(num2);
            int num = Integer.parseInt("xyz");
            System.out.println(num);
        }
        catch (NumberFormatException e) {
        }
        finally {
            System.out.println("add a section to the code that will execute regardless of whether the exception is thrown or not");
        }
    }
}
