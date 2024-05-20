package basic2.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int[] randNumbers = new int[20];
        for (int i = 0; i < randNumbers.length; i++) {
            int randomInt = random.nextInt(101);
            randNumbers[i] = randomInt;
        }
        System.out.println(Arrays.toString(randNumbers));


        int minimalna = 101;
        for (int i = 0; i < randNumbers.length; i++) {
            if (minimalna > randNumbers[i]) {
                minimalna = randNumbers[i];
            }
        }
        System.out.println("Minimalna licza to: " + minimalna);
    }
}
