package basic2.example;

public class MethodsExample {
    public static void main(String[] args) { // static_main_String[]
        sayHello();
        sayHello();
        sayHello("Walt");
        sayHello("Walt", "Kowalski");
        sayHello("John", 22);
        sayHello("Walt", 22L);
        double someSum = add(3, 0.1415);
        System.out.println(someSum);
        double theAnswer = add(40, 2);
        System.out.println(theAnswer);
    }

    public static void sayHello() { // static_sayHello_
        System.out.println("Hello all!");
        System.out.println("how are you doing today?");
    }

    public static void sayHello(String name) { // static_sayHello_String
        System.out.println("Hello, " + name + "!");
    }

    public static void sayHello(String firstName, String lastName) { // static_sayHello_String
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }

    public static void sayHello(String name, int age) { // static_sayHello_String
        System.out.println("Hello, " + name + "! You are " + age + " years old. :)");
    }

    public static void sayHello(String name, long age) { // static_sayHello_String
        System.out.println("Hello, " + name + "! You are " + age + " years old. :)");
    }

    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }
}
