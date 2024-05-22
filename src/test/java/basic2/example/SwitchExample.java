package basic2.example;

public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 2;
        String dayOfWeekString;
        switch (dayOfWeek) {
            case 1:
                dayOfWeekString = "Monday";
                break;
            case 2:
                dayOfWeekString = "Tuesday";
                break;
            case 3:
                dayOfWeekString = "Wednesday";
                break;
            default:
                dayOfWeekString = "Invalid";
                break;
        }
        System.out.println(dayOfWeekString);
    }
}
