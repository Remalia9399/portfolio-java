package pl.coderslab.homeworks.arrays;
/*
Zadanie 1
W pakiecie pl.coderslab.homeworks.arrays, w pliku Main01.java umieść metodę o sygnaturze:

public static int[] returnUnique(int[] arr).

Uzupełnij ciało metody w taki sposób by z tablicy arr wybrała tylko unikalne wartości, które następnie mają być zwrócone z metody.

Przykład dla tablicy [1,1,2,3,3,4], powinniśmy otrzymać [1,2,3,4].
 */

import java.util.Arrays;

public class Main01 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};
        for(int i = 0 ; i < arr.length ;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] arr2 =returnUnique(arr);
        for(int i = 0 ; i < arr2.length ;i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    public static int[] returnUnique(int[] arr){
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[end-1];
                    end--;
                    j--;
                }
            }
        }

        int[] newArr = new int[end];
        System.arraycopy(arr, 0, newArr, 0, end);
        Arrays.sort(newArr);
        return newArr;
    }

}





