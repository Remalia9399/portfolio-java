package prework1.cflowcontrol;

public class Main06 {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            System.out.print(i);
            int modulo = i % 2;
            if (modulo == 0) {
                System.out.print(" - even");
            } else System.out.print(" - odd");
            System.out.println(" ");
        }

        int i = 0;
        while (i <= n) {
            System.out.print(i);
            int modulo = i % 2;
            if (modulo == 0) {
                System.out.print(" - even");
            } else System.out.print(" - odd");
            System.out.println(" ");
            i++;
        }
    }

}
