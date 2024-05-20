package homeworks.methods;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(divisibleBy(4, 2));
        System.out.println(divisibleBy(4, 3));

    }

    public static boolean divisibleBy(int a, int b) {
        boolean db = false;
        if (a % b == 0) {
            db = true;
        } else db = false;
        return db;
    }
}
