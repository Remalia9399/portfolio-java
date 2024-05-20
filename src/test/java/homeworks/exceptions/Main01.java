package homeworks.exceptions;

public class Main01 {

    public static void main(String[] args) {
        String a = "10";
        String b = "0";
        average(a,b);
        System.out.println("Another double method");
        averageDouble(a,b);
    }
    public static void average(String a, String b) {
        try {
            int aInt = Integer.parseInt(a);
            int bInt = Integer.parseInt(b);
            int c = aInt / bInt;
            System.out.println(aInt +" / " +bInt + " = " + c);
        }
        catch (NumberFormatException e1)
        {
            System.out.println("Incorrect integer format");
        }
        catch (ArithmeticException e2) {
            System.out.println("You cannot divide by 0");
        }
        finally {
            System.out.println("End of method");
        }
    }
    public static void averageDouble(String a, String b) {
        try {
            double aDouble = Double.parseDouble(a);
            double bDouble = Double.parseDouble(b);
            double c = aDouble / bDouble;
            if (bDouble == 0.0) {
                throw new ArithmeticException();
            }
            System.out.println(aDouble +" / " +bDouble + " = " + c);
        }
        catch (NumberFormatException e1)
        {
            System.out.println("Invalid double number format");
        }
        catch (ArithmeticException e2) {
            System.out.println("You cannot divide by 0");
        }
        finally {
            System.out.println("end of method");
        }
    }
}
