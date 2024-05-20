package homeworks.exceptions;

public class Main02 {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f"};
        String arrString = safeGet(arr,8);
        System.out.println(arrString);
    }
    public static String safeGet(String[] strTab, int index) {
        String tmpString = "";
        try {
            tmpString = strTab[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            tmpString = "The selected index is out of range";
        }
        return tmpString;
    }
}

