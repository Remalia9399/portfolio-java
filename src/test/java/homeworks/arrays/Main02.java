package homeworks.arrays;

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