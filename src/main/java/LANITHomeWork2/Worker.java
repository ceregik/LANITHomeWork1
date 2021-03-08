package LANITHomeWork2;

import LANITHomeWork2.animal.Animal;
import LANITHomeWork2.animal.Voice;
import LANITHomeWork2.food.Food;

public class Worker {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Worker(String name){
        this.name = name;
    }

    public void feed(Animal animal, Food food){
        animal.eat(food);
    }

    public String getVoice(Voice animal){

           return animal.doVoice();}


}
