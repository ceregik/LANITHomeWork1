package LANITHomeWork2.animal;

import java.util.HashMap;

public abstract class Enclosure<enclosur>{

    public abstract HashMap<String, Animal> getEnclosur();

    private int weightEnclosure;

    public abstract void deleteAnimal(String name);

    public abstract void getEnclosurAnimal(String name);

    public int getWeightEnclosure() {
        return weightEnclosure;
    }

    protected void setWeightEnclosure(int weightEnclosure) {
        this.weightEnclosure = weightEnclosure;
    }

    public Enclosure(Capacity capacity){
        switch (capacity){
            case LITTLE: weightEnclosure = 10; break;
            case MEDIUM: weightEnclosure = 20; break;
            case BIG: weightEnclosure = 30; break;
            case LARGE: weightEnclosure = 40; break;
        }
    }
}
