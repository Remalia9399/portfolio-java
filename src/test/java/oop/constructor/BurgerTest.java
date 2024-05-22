package oop.constructor;

public class BurgerTest {

    public static void main(String[] args) {
        Burger small = new Burger("small", 9.99);
        Burger medium = new Burger(); // default Burger is medium
        Burger big = new Burger("big", 25.99);

        System.out.println(small);
        System.out.println(medium);
        System.out.println(big);
    }
}
