package basic2.arrays;

public class Main01 {
    public static void main(String[] args) {
        int[] mainTab = new int[50];
        for (int i = 0; i < mainTab.length; i = i + 1)
            mainTab[i] = i;


        for (int i = 0; i < mainTab.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            if (mainTab[i] < 10) {
                System.out.print("0");
            }
            System.out.print(mainTab[i] + ", ");
        }
    }
}