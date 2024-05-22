package oop.inheritance;

import oop.inheritance.Employee;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(int id, String firstname, String lastName, double wage) {
        super(id, firstname, lastName, wage);
    }

    public double calculatePayment(double hours) {
        double cash = 0;
        if (hours >= 0) {
            cash = this.wage * hours;
        }
        return cash;
    }

    public static void main(String[] args) {
        HourlyEmployee user = new HourlyEmployee(10, "Walt", "Kowalski", 1);
        System.out.println(user.wage);
        System.out.println(user.calculatePayment(15));
    }
}