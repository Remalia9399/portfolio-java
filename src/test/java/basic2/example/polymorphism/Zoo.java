package basic2.example.polymorphism;

import basic2.example.inheritance.*;
import basic2.example.inheritance.food.*;

import java.util.ArrayList;
import java.util.List;



public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void buyAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void giveSounds() {
        for (Animal a : this.animals) {
            a.giveSound(); // polymorphism: either Dog.giveSound() or Whale.giveSound()
        }
    }

    public void feedAnimals() {
        for (Animal a : this.animals) {
            if(a instanceof Dog) {
                a.feed(new Meat());
//                break;
//                return;
                continue;
            }
            if(a instanceof Whale) {
                a.feed(new Crill());
                continue;
            }
            if(a instanceof Capybara) {
                a.feed(new Carrot());
                continue;
            }
            System.out.println("nie wiem czym nakarmić: " + a.getClass().getName());
        }
        // after break
    }
}
