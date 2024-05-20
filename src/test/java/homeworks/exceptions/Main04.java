package pl.coderslab.homeworks.exceptions;
/*
Zadanie 4
W pakiecie pl.coderslab.homeworks.exceptions, w pliku Main04.java umieść metodę o sygnaturze:

public static int toInt(String str).

uzupełnij ciało metody tak, aby zwracała napis str zamieniony na typ int,
obsłuż możliwe wyjątki.
 */

public class Main04 {

    public static void main(String[] args) {
        String str = "12345678";
        int strToInt = toInt(str);
        System.out.println(strToInt);


    }
    public static int toInt(String str) {
        int toInt = 0;
        try {
            toInt = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            toInt = 0;
        }
        return toInt;
    }
}
