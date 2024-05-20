package basic2.exceptions;

public class Main02 {

    public static void main(String[] args) {
        int[] tab = {  5, 1, 6, 7, 8 } ;
        try {
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("An ArrayIndexOutOfBoundsException error occurred, we exceeded the index in the tab array");
            System.out.println("This is an uncontrolled exception and is a logical error when writing a program");
        }
    }

}
