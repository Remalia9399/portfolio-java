package homeworks.exceptions;

import java.util.NoSuchElementException;

public class Main05 {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {2, 4, 6};
        int arrIndex = indexOf(arr, 7);
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
        } catch (NoSuchElementException e) {
//            index = -1;
        }
        return index;
    }
}