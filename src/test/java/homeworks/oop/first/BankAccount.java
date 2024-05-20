package pl.coderslab.homeworks.oop.first;

public class BankAccount {
    private int number = 1234567890;
    private double cash = 0;
    private int getNumber() { return number; }
    private double getCash() { return cash; }
    private void depositCash(double amount) {
        if ( amount > 0) {
            this.cash += amount;
        }
    }
    private double withdrawCash( double amount) {
        double wwCash = 0;
        if ( amount > 0 ){
            if (cash >= amount) {
                wwCash = amount;
                cash -= wwCash;
            } else if (cash < amount) {
                wwCash = cash;
                cash -= wwCash;
            }
        } else wwCash= 0;
        return wwCash;
    }
    public String toString() {
        return "Numer konta: " + String.valueOf(number)
                + " Stan konta: " + String.valueOf(cash);
    }

    /*
    Testy
     */

//    public static void main(String[] args) {
//        BankAccount Janusz = new BankAccount();
//        Janusz.depositCash(200);
//        System.out.println("Saldo konta: " + Janusz.cash);
//        System.out.println("Wyplacenie: " + Janusz.withdrawCash(120));
//        System.out.println("Saldo konta: " + Janusz.cash);
//        System.out.println(Janusz.toString());
//    }
}
