package basic2.methods;

public class Main08 {

    public static void main(String[] args) {
        maxOfThree(3, 4, 3);
    }
    public static void maxOfThree(int nr1, int nr2, int nr3) {
        if (nr1 >= nr2 && nr1 >= nr3) {
            System.out.println(nr1);
        } else if (nr2 >= nr1 && nr2 >= nr3) {
            System.out.println(nr2);
        } else if (nr3 >= nr1 && nr3 >= nr2) {
            System.out.println(nr3);
        }
    }
}
