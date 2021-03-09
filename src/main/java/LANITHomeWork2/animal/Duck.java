package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;

public class Duck extends  Vegan implements  Run,Swim,Fly,Voice{


    public Duck(String name, int weight, String voice) {
        super(name, weight, voice);
    }

    @Override
    public void eat(Food food) {
        System.out.print("Duck"); super.eat(food);
    }

    @Override
    public void run() {
        System.out.println("Duck run");
    }

    @Override
    public void walk() {
        System.out.println("Duck walk");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }

    @Override
    public void playInWater() {
        System.out.println("Duck play in water");
    }

    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void createSockets() {
        System.out.println("Duck create sockets");
    }

    @Override
    public String doVoice() {
        return getVoice();
    }

    @Override
    public String shout() {
        return getVoice()+"!!!";
    }
}
