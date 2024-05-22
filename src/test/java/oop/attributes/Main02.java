package oop.attributes;

public class Main02 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        System.out.println(testAttribute.protectedAttribute);
        System.out.println(testAttribute.publicAttribute);
        System.out.println(testAttribute.getClass());
        System.out.println(testAttribute.toString());
        System.out.println(testAttribute.hashCode());
    }
}