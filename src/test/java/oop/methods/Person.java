package oop.methods;

public class Person {
    String name = "Walt";
    String surname = "Kowalski";
    int age = 24;
    char gender = 'k';

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    void getFullName(String name, String surname) {
        System.out.println(String.join(" ", this.name, this.surname));
    }

    void increaseAge(int age) {
        int aage = age + 1;
        System.out.println(aage);
    }

    int increaseAge1(int age) {
        return age = age + 1;
    }


//    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.name);
//        System.out.println(person.surname);
//        System.out.println(person.age);
//        System.out.println(person.gender);
//        person.setName("Walt");
//        person.setSurname("Kowalski");
//        person.setAge(24);
//        person.setGender('M');
//        System.out.println(person.name);
//        System.out.println(person.surname);
//        System.out.println(person.age);
//        System.out.println(person.gender);
//        person.getFullName(person.name, person.surname);
//        person.increaseAge(1);
//        int age1 = person.increaseAge1(1);
//        System.out.println(age1);
//
//    }
}


