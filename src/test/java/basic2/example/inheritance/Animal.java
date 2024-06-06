package basic2.example.inheritance;

import basic2.example.inheritance.food.Food;

public abstract class Animal {
    public int ageInSeconds;

    public abstract void giveSound();

    public void feed(Food food) {
        System.out.println("omnomnom, I'm " + this.getClass().getSimpleName() + " I'love eating: " + food);
    }

    public void breathe() {
        System.out.println("absorb O2 from environment and transport into animal cell(s)");
    }
}
