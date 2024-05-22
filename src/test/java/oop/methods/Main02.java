package oop.methods;

public class Main02 {

    public static void main(String[] args) {
        Person person = new Person();
        String name = "Walt";
        String surname = "Kowalski";
        int age = 24;
        char gender = 'k';
        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.age);
        System.out.println(person.gender);
        person.setName("Walt");
        person.setSurname("Kowalski");
        person.setAge(24);
        person.setGender('M');
        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.age);
        System.out.println(person.gender);
        person.getFullName(person.name, person.surname);
        person.increaseAge(1);
        int age1 = person.increaseAge1(1);
        System.out.println(age1);

    }
}

