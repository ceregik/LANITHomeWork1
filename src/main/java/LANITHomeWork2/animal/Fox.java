package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;

public class Fox extends  MeatEaters implements  Run,Swim,Voice{

    public Fox(String name, int weight, String voice) {
        super(name, weight, voice);
    }

    @Override
    public void eat(Food food) {
        System.out.print("fox"); super.eat(food);
    }

    @Override
    public void run() {
        System.out.println("fox run");
    }

    @Override
    public void walk() {
        System.out.println("fox walk");
    }

    @Override
    public void swim() {
        System.out.println("fox swim");
    }

    @Override
    public void playInWater() {
        System.out.println("fox play in water");
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
