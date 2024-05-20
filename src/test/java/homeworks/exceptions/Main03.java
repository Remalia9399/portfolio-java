package homeworks.exceptions;

public class Main03 {

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(getLength(str));
    }
    public static int getLength(String str) {
        int length;
        try {
            length = str.length();
        }
        catch (NullPointerException e) {
            length = 0;
        }
        return length;
    }
}