package pl.coderslab.homeworks.exceptions;
/*
Zadanie 5
W pakiecie pl.coderslab.homeworks.exceptions, w pliku Main05.java umieść metodę o sygnaturze:

public static int indexOf(int[] elements, int value).

uzupełnij ciało metody tak, aby zwracała index elementu value zawartego w tablicy elements,
jeśli tablica nie posiada podanego elementu zwróć wyjątek NoSuchElementException,
przetestuj działanie programu wywołując metodę indexOf z elementem, który występuje w tablicy i z takim, który w niej nie występuje,
przy wywołaniu metody indexOf dodaj obsługę wyjątku NoSuchElementException.
przetestuj ponownie działanie programu.
 */

import java.util.NoSuchElementException;

public class Main05 {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {2, 4, 6};
        int arrIndex = indexOf(arr,7);
        System.out.println(arrIndex);


    }
    public static int indexOf(int[] elements, int value) {
        int end = elements.length;
        int index = -1;
        try {
            for (int i = 0; i < end; i++) {
                if (elements[i] == value) {
                    index = i;
                }
            }
            if (index == -1)
                throw new NoSuchElementException();
        }
        catch (NoSuchElementException e) {
            index = -1;
        }
        return index;
    }

}
