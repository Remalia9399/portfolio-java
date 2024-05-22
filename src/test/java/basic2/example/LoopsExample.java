package basic2.example;

public class LoopsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("for loop " + i);
        }

        int j = 0;
        while (j < 4) {
            System.out.println("while " + j);
            j = j + 1;
        }

        int k = 0;
        do {
            System.out.println("do while " + k);
            k = k + 1;
        } while (k < 4);

        String[] words = {"ala", "ma", "kota"};

        for (String word : words) { // foreach
            System.out.println(word);
        }

        double[] doubles = {3.14, 2.75};

        for (double d : doubles) { // foreach
            System.out.println(d);
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
