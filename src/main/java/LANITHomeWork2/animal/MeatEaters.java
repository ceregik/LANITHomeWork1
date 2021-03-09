package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;
import LANITHomeWork2.food.Meat;

public abstract class MeatEaters extends Animal  {


    MeatEaters(String name, int weight, String voice) {
        super(name, weight, voice);
    }
    MeatEaters(String name, int weight){super(name, weight);}
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            setSatiety(getSatiety()+ food.getSatiety());
            System.out.println(" Eat "+ food.getName() + " I`m " +getSatiety() + " satiety");
        }
        else{
            System.out.println(" don`t want eat" + food.getName());
            throw new WrongFoodException();
        }
        }

}
