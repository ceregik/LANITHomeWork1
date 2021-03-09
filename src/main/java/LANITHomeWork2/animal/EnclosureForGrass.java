package LANITHomeWork2.animal;

import java.util.HashMap;

public class EnclosureForGrass<enclosur> extends Enclosure{

    private HashMap<String,Vegan> enclosur  = new HashMap<>();

    public EnclosureForGrass(Capacity capacity) {
        super(capacity);
    }

    public HashMap<String, Vegan> getEnclosur() {
        return enclosur;
    }

    public void addAnimal(Vegan animal){
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
