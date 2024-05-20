package pl.coderslab.homeworks.arrays;
/*
adanie 2
W pakiecie pl.coderslab.homeworks.arrays, w pliku Main02.java umieść metodę o sygnaturze:

public static int[] append(int[] arr).

Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana do tymczasowej tablicy, której rozmiar ma być 2-krotnie większy od tablicy podanej.
Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności.
Metoda ma zwrócić skopiowaną i uzupełnioną tablicę. Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona tablica int arrTmp[] = {1,2,3,3,2,1};
 */

public class Main02 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int arrAppend[] = append(arr);
        for (int i = 0; i < arrAppend.length; i++)
            System.out.print(arrAppend[i] + " ");

    }

    public static int[] append(int[] arr) {
        int end1 = arr.length;
        int end2 = end1 * 2;
        int[] arr2 = new int[end2];
        for (int i = 0; i < end1; i++) {
            arr2[i] = arr[i];
            arr2[end2 - (1 + i)] = arr[i];
        }
        return arr2;

    }
}