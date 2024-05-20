package basic2.arrays;

import java.util.Arrays;
import java.util.Random;


public class Main04 {

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int randomInt = random.nextInt(101);
            numbers[i] = randomInt;
        }
        System.out.println(Arrays.toString(numbers));
        int[] reverse = new int[10];

        for (int i = 0, j = reverse.length - 1; i < reverse.length; i++, j--) {
            reverse[i] = numbers[j];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
