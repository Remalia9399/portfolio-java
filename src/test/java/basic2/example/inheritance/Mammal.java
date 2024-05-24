package basic2.example.inheritance;

// Mammal deriving, child class
// Animal base class, parent class, super class
public class Mammal extends Animal { // "jest"
    public String lungs = "lungs";

    @Override
    public void giveSound() {
        System.out.println("dźwięk ssaka");
    }

    @Override
    public void breathe() {
        System.out.println("absorb O2 from atmosphere using " + this.lungs + " and transport into mammal cells");
    }
}
