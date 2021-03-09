package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;

public abstract class Animal{

    private String name,voice;
    private int weight,satiety = 0;

    public abstract void eat(Food food);

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }
    Animal(String name, int weight, String voice){
        this.name=name;
        this.weight=weight;
        this.voice=voice;
    }
    Animal(String name, int weight){
        this.name=name;
        this.weight=weight;
    }
}
