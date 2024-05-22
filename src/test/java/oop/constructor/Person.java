package oop.constructor;

public class Person {
    private String name;
    private String surname;
    private int age;
    private char gender;
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, String surname, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
//  TEST
//    public static void main(String[] args) {
//        Person walt = new Person("Walt", "Kowalski");
//        System.out.println(walt.name + " " + walt.surname);
//    }
}