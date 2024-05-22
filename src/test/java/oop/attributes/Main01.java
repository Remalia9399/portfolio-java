package oop.attributes;

public class Main01 {

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        System.out.println(testAttribute.protectedAttribute);
        System.out.println(testAttribute.publicAttribute);
//        System.out.println(am.privateAtrribute); it doesn't work because it's private

    }
}
