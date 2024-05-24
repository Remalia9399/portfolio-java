package basic2.example.inheritance;

public class Whale extends Mammal {
    public String fins = "fins";

    @Override
    public void giveSound() {
        System.out.println("wielorybi śpiew");
    }

    @Override
    public void breathe() {
        surface();
        super.breathe();
    }

    public void surface() {
        System.out.println("go to surface using " + this.fins);
    }

    public void submerge() {
        System.out.println("go to under water using " + this.fins);
    }
}
