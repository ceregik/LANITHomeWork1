package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;

public class Fish extends  MeatEaters implements  Swim{

    public Fish(String name, int weight, String voice) {
        super(name, weight, voice);
    }

    public Fish(String name, int weight){super(name, weight);}


    @Override
    public void eat(Food food) {
        System.out.print("fish"); super.eat(food);
    }

    @Override
    public void swim() {
        System.out.println("fish swim");
    }

    @Override
    public void playInWater() {
        System.out.println("fish play in water");
    }

}
