package pl.coderslab.homeworks.exceptions;
/*
Zadanie 2
W pakiecie pl.coderslab.homeworks.exceptions, w pliku Main02.java umieść metodę o sygnaturze:

public static String safeGet(String[] strTab, int index).

uzupełnij ciało metody tak, aby zwracała element tablicy strTab zawarty pod indeksem index,
dodaj obsługę odpowiedniego wyjątku,
przetestuj działanie programu.

 */

public class Main02 {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f"};
        String arrString = safeGet(arr,8);
        System.out.println(arrString);


    }
    public static String safeGet(String[] strTab, int index) {
        String tmpString = "";
        try {
            tmpString = strTab[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            tmpString = "Wybrany index jest poza zakresem";
        }
        return tmpString;
    }

}

