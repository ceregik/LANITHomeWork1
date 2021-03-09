package LANITHomeWork2.animal;

import LANITHomeWork2.food.Food;

import java.util.Objects;

public abstract class Animal{

    private String name,voice;
    private int weight,satiety = 0;

    public abstract void eat(Food food) throws WrongFoodException;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && satiety == animal.satiety && Objects.equals(name, animal.name) && Objects.equals(voice, animal.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, voice, weight, satiety);
    }

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
