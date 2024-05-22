package basic2.example;

//import homeworks.homeworks2.Person;
import oop.methods.Person;

public class FinalKeywordExample {
    final static double MY_PI = 3.141592;
    final double myPi = 3.141592;

    public static void main(String[] args) {
        final double myPi = 3.141592;
        final Person someone = new Person();
        someone.name = "Walt";
//        someone = new Person(); // nope! final reference
    }

    final void doStuff() { // can NOT OVERRIDE final method

    }
}
