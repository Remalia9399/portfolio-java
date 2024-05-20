package homeworks.methods;

public class Main01 {

    public static void main(String[] args) {
        System.out.println(dogAge(1.5));
        System.out.println(dogAge(5));
    }

    public static double dogAge(double age) {
        double dogAge = 0;
        for (double i = 0; i < age; i += 0.5) {
            if (i < 2) {
                dogAge += 5.25;
            } else dogAge += 2;
        }
        return dogAge;
    }
}


