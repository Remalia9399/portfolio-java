package basic2.methods;


public class Main01 {

    public static void main(String[] args) {
        int multiply1 = multiply(2, 2);
        System.out.println(multiply1);

    }

    public static int multiply(int multipler, int index) {
        int result =multipler * index;
        return result;
    }
}
