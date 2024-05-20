package homeworks.exceptions;

public class Main04 {

    public static void main(String[] args) {
        String str = "12345678";
        int strToInt = toInt(str);
        System.out.println(strToInt);
    }

    public static int toInt(String str) {
        int toInt = 0;
        try {
            toInt = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            toInt = 0;
        }
        return toInt;
    }
}
