package LANITHomeWork2;

import LANITHomeWork2.animal.*;
import LANITHomeWork2.food.*;

import java.util.ArrayList;

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
                animal.eat(food);
            }
        }

        Worker sam = new Worker("Sam");

        Rabbit rabbit = new Rabbit("Lake",3,"rabbit");
        Rabbit wolf = new Rabbit("Vace",7,"wolf");
        Egg egg = new Egg();
        Pork pork = new Pork();
        Carrot carrot = new Carrot();


        sam.feed(rabbit,egg);
        sam.feed(wolf,pork);
        sam.feed(wolf,carrot);
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
    }
}
