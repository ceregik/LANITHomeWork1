package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;

public class Giraffe extends  Vegan implements  Run,Voice{


    public Giraffe(String name, int weight, String voice) {
        super(name, weight, voice);
    }

    @Override
    public void eat(Food food) {
        System.out.print("Giraffe"); super.eat(food);
    }

    @Override
    public void run() {
        System.out.println("Giraffe run");
    }

    @Override
    public void walk() {
        System.out.println("Giraffe walk");
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
