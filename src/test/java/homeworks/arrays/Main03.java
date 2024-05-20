package pl.coderslab.homeworks.arrays;
/*
Zadanie 3
W pakiecie pl.coderslab.homeworks.arrays, w pliku Main03.java umieść metodę o sygnaturze:

public static boolean contains(int[] arr, int element).

uzupełnij ciało metody tak, by sprawdzała, czy w tablicy arr istnieje element,
jeżeli tak ma zwracać true,
jeżeli nie ma zwracać false.
 */

public class Main03 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Tablica zawiera: " + arr.length + " elementów");
        System.out.println(contains(arr,0));


    }
    public static boolean contains(int[] arr, int element) {
        boolean cs;
        try {
            int newArr = arr[element];
            cs = true;
        } catch (ArrayIndexOutOfBoundsException e) {
            cs = false;
        }
        return cs;
    }

}
