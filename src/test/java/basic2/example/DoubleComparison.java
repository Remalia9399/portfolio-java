package basic2.example;

public class DoubleComparison {
    public static void main(String[] args) {
        double money1 = 0.1;
        double money2 = 0.2;
        double money3 = 0.3;

        double moneySum = money1 + money2;

        System.out.println(money3);
        System.out.println(moneySum);

        if(moneySum == money3) { // error
            System.out.println("we have the same amount of money");
        }

        if(Math.abs(moneySum - money3) < 0.1) { // fixed
            System.out.println("'fixed' we have the same amount of money");
        }
    }
}
