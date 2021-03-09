package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;

public class Rabbit extends  Vegan implements  Run,Voice{


    public Rabbit(String name, int weight, String voice) {
        super(name, weight, voice);
    }

    @Override
    public void eat(Food food) {
        System.out.print("Rabbit"); super.eat(food);
    }

    @Override
    public void run() {
        System.out.println("Rabbit run");
    }

    @Override
    public void walk() {
        System.out.println("Rabbit walk");
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
