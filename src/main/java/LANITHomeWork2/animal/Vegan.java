package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;
import LANITHomeWork2.food.Grass;

public abstract class Vegan extends Animal  {

    Vegan(String name, int weight, String voice) {
        super(name, weight, voice);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {

        if (food instanceof Grass) {
            setSatiety(getSatiety()+ food.getSatiety());
            System.out.println(" Eat "+ food.getName() + " I`m " +getSatiety() + " satiety");
        }
        else{
            System.out.println(" don`t want eat "+ food.getName());
            throw new WrongFoodException();
        }
    }

}
