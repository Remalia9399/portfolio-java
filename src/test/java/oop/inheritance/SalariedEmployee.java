package oop.inheritance;

import oop.inheritance.Employee;
public class SalariedEmployee extends Employee {
    public SalariedEmployee(int id, String firstname, String lastName, double wage) {
        super(id, firstname, lastName, wage);
    }
    public final double static calculatePayment() {
        double payment;
        double hoursInMonth = 190;
        payment = (hoursInMonth * wage);
        return payment;
    }

    public static void main(String[] args) {
        SalariedEmployee user = new SalariedEmployee(123, "Walt", "Kowalski", 1);
        System.out.println(user.wage);
        System.out.println(user.calculatePayment());
    }
}