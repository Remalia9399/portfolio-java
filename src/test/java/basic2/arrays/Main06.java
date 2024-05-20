package basic2.arrays;

import java.util.Arrays;

public class Main06 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 4, 5, 6, 5, 3, 6, 6};
        int[] secondNumbers = {2, 4, 2, 5, 9, 0, 8, 8, 3, 2};
        int[] sumo = new int[10];
        for (int i = 0; i < sumo.length; i++) {
            sumo[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(secondNumbers));
        System.out.println(Arrays.toString(sumo));
    }
}
