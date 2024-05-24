package basic2.example.inheritance;

public class AnimalCastingExample {
    public static void main(String[] args) {
        //Animal animal2 = new Mammal(); // upcasting
        //animal2.breathe();

        // upcasting and downcasting exmaple
        Object o = new Mammal(); // upcasting
        System.out.println(o.toString()); // on "o" reference we only see Object part of the Mammal
        if(o instanceof Mammal m) { // java 17 improved instanceof "downcasting"
            m.breathe();
        }
        System.out.println("test types of object");
        System.out.println(o instanceof Mammal); // true
        System.out.println(o instanceof Animal); // true
        System.out.println(o instanceof Object); // true
        System.out.println(o instanceof String); // false
    }
}
