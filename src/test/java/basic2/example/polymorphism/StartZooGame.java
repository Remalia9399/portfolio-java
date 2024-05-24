package basic2.example.polymorphism;

import basic2.example.inheritance.*;


import java.util.ArrayList;
import java.util.List;

public class StartZooGame {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.buyAnimal(new Dog());
        zoo.buyAnimal(new Whale());
        zoo.buyAnimal(new Capybara());
        zoo.giveSounds();
        zoo.feedAnimals();
    }
}
