package LANITHomeWork2.animal;

import java.util.HashMap;

public class EnclosureForMeat extends Enclosure{

    private HashMap<String,MeatEaters> enclosur  = new HashMap<>();

    public EnclosureForMeat(Capacity capacity) {
        super(capacity);
    }

    public HashMap<String, MeatEaters> getEnclosur() {
        return enclosur;
    }

    public void addAnimal(MeatEaters animal){
        if (getWeightEnclosure() - animal.getWeight()>=0){
            setWeightEnclosure(getWeightEnclosure() - animal.getWeight());
            enclosur.put(animal.getName(),animal);
            System.out.println(animal.getName() + " Added");
        }else{
            System.out.println("Not place for him");
        }

    }

    public void deleteAnimal(String name){
        enclosur.remove(name);
    }

    public void getEnclosurAnimal(String name) {
        enclosur.get(name);
    }
}
