package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;

public class Wolf extends  MeatEaters implements  Run,Swim,Voice{

    public Wolf(String name, int weight, String voice) {
        super(name, weight, voice);
    }

    @Override
    public void eat(Food food) {
        System.out.print("wolf"); super.eat(food);
    }

    @Override
    public void run() {
        System.out.println("wolf run");
    }

    @Override
    public void walk() {
        System.out.println("wolf walk");
    }

    @Override
    public void swim() {
        System.out.println("wolf swim");
    }

    @Override
    public void playInWater() {
        System.out.println("wolf play in water");
    }

    @Override
    public String doVoice() {
        return  getVoice();
    }

    @Override
    public String shout() {
        return getVoice()+"!!!";
    }
}
