package basic2.example.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Mammal();
        animal.breathe();

        Mammal mammal = new Mammal();
        mammal.breathe();
        mammal.ageInSeconds = 42;
        System.out.println("thismammal lungs = " + mammal.lungs);
        Animal aa = mammal; // upcasting
        System.out.println("call breathe() on Mammal instance upcasted to Animal reference");
        aa.breathe(); // real method from Mammal type called no matter reference type Animal

        Whale w = new Whale();
        w.submerge();
        w.breathe();
    }
}