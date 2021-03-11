package LANITHomeWork2;

import LANITHomeWork2.animal.*;
import LANITHomeWork2.food.*;

import java.util.ArrayList;
import java.util.HashMap;

import static LANITHomeWork2.animal.Capacity.LITTLE;

public class Zoo{
    public static void main(String[] args){

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Duck("Tod",2,"duck"));
        animals.add(new Fish("Bob",0));
        animals.add(new Fox("Rex",5,"Fox"));
        animals.add(new Wolf("Rok",6,"wolf"));
        animals.add(new Rabbit("Lake",3,"rabbit"));
        animals.add(new Giraffe("Kol",20,"Giraffe"));

        ArrayList<Food> foods = new ArrayList<Food>();
        foods.add(new Pork());
        foods.add(new Egg());
        foods.add(new Carrot());
        foods.add(new Apple());
        foods.add(new Chicken());
        foods.add(new Wheat());

        int i = 0;

        for (Animal animal : animals){
            for (Food food : foods){
                System.out.print(++i + " ");
                try {
                    animal.eat(food);
                } catch (WrongFoodException e) {
                    e.printStackTrace();
                }
            }
        }

        Worker sam = new Worker("Sam");

        Rabbit rabbit = new Rabbit("Laki",3,"rabbit");
        Wolf wolf = new Wolf("Vace",7,"wolf");
        Fox fox = new Fox("Fina", 6,"fox");
        Egg egg = new Egg();
        Pork pork = new Pork();
        Carrot carrot = new Carrot();


        try {
            sam.feed(rabbit,egg);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            sam.feed(wolf,pork);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            sam.feed(wolf,carrot);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        System.out.println(sam.getVoice(rabbit));
        System.out.println(sam.getVoice(wolf));
        Swim [] pond = {
                new Fish("rip", 1),
                new Duck("lil", 2 , "cry"),
                new Fish("peep", 1)
        };

        for (Swim animal : pond){
            animal.swim();
        }

        HashMap<String,Animal> h23  = new HashMap<>();
        h23.put(wolf.getName(), wolf);
        Enclosure one = new Enclosure(LITTLE);
        one.addAnimal(fox);
        one.addAnimal(rabbit);
        one.addAnimal(wolf);
        Enclosure two = new Enclosure(LITTLE);
        two.addAnimal(rabbit);
        two.addAnimal(fox);
        System.out.println(one.getWeightEnclosure());
        one.deleteAnimal("bos");
        System.out.println(one.getEnclosur());
    }
}
