package pl.coderslab.homeworks.methods;
/*
Zadanie 2
W pakiecie pl.coderslab.homeworks.methods, w pliku Main02.java umieść metodę o sygnaturze public static boolean divisibleBy(int a, int b ):

Uzupełnij ciało metody tak, aby zwracała true bądź false w zależności czy zmienna a jest podzielna przez b.
 */

public class Main02 {

    public static void main(String[] args) {

        System.out.println(divisibleBy(4,2));
        System.out.println(divisibleBy(4,3));


    }
    public static boolean divisibleBy(int a, int b) {
        boolean db = false;
        if ( a % b == 0 ) {
            db = true;
        } else db = false;
        return  db;


    }

}
