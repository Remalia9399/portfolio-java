package pl.coderslab.homeworks.exceptions;
/*
Zadanie 3
W pakiecie pl.coderslab.homeworks.exceptions, w pliku Main03.java umieść metodę o sygnaturze:

public static int getLength(String str).

uzupełnij ciało metody tak, aby zwracała długość napisu str,
przetestuj działanie metody przekazując do niej parametr o wartości null,
zabezpiecz program przed wystąpieniem wyjątku NullPointerException.
 */

public class Main03 {

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(getLength(str));


    }
    public static int getLength(String str) {
        int length;
        try {
            length = str.length();
        }
        catch (NullPointerException e) {
            length = 0;
        }
        return length;
    }

}
