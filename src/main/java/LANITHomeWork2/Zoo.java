package LANITHomeWork2;

import LANITHomeWork2.animal.*;
import LANITHomeWork2.food.Carrot;
import LANITHomeWork2.food.Egg;
import LANITHomeWork2.food.Pork;

public class Zoo{
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit("Bob",2,"rabbit");
        Egg egg = new Egg();
        Carrot carrot = new Carrot();
        Pork pork = new Pork();
        rabbit.eat(egg);
        rabbit.eat(carrot);
        Wolf wolf = new Wolf("bos",10,"Vuf");
        wolf.eat(pork);

        Fish fish = new Fish("acb", 1 );
        Worker sam = new Worker("Sam");
        //sam.getVoice(fish); Fish can`t voice
        sam.feed(rabbit,egg);
        sam.feed(wolf,pork);
        sam.feed(wolf,carrot);
        System.out.println(sam.getVoice(rabbit));
        System.out.println(sam.getVoice(wolf));
        Swim [] pond = {
                new Fish("one", 1),
                new Duck("two", 2 , "cry"),
                new Fish("three", 1)
        };

        for (int i=0; i<pond.length; i++){
            pond[i].swim();
        }
    }
}
