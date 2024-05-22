package oop.inheritance;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double wage;
    public Employee(int id, String firstname, String lastName, double wage) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastName;
        this.wage = wage;
    }
    public void raiseWage(double percent) {
        if ( percent >=0 ) {
            this.wage += (wage * percent / 100);
        }
    }

    public static void main(String[] args) {
        Employee user = new Employee(15, "Walt", "Kowalski", 10);
        System.out.println(user.wage);
        user.raiseWage(50);
        System.out.println(user.wage);
    }
}
