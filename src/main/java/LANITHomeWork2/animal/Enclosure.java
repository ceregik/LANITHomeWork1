package LANITHomeWork2.animal;

import java.util.HashMap;

public  class Enclosure<enclosur>{

    private HashMap<String,Animal> enclosur  = new HashMap<>();

    public HashMap<String, Animal> getEnclosur() {
        return enclosur;
    }

    private int weightEnclosure;

    private String enclosurType = "";

    public void addAnimal(Vegan animal){
        if (enclosurType.equals("vegan") || enclosurType.equals("")) {
            if (getWeightEnclosure() - animal.getWeight() >= 0) {
                setWeightEnclosure(getWeightEnclosure() - animal.getWeight());
                enclosur.put(animal.getName(), animal);
                enclosurType = "vegan";
                System.out.println(animal.getName() + " Added");
            } else {
                System.out.println("Not place for him");
            }
        }
            else {
            System.out.println("It`s for Meateaters");
        }
    }
    public void addAnimal(MeatEaters animal){
        if (enclosurType.equals("meat") || enclosurType.equals("")) {
            if (getWeightEnclosure() - animal.getWeight() >= 0) {
                setWeightEnclosure(getWeightEnclosure() - animal.getWeight());
                enclosur.put(animal.getName(), animal);
                enclosurType = "meat";
                System.out.println(animal.getName() + " Added");
            } else {
                System.out.println("Not place for him");
            }
        }else {
            System.out.println("It`s for Vegan");
        }
    }

    public void deleteAnimal(String name){
        enclosur.remove(name);
    }

    public void getEnclosurAnimal(String name) {
        enclosur.get(name);
    }

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
