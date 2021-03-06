package model;

public class Kotik {

    private int satiety;
    public static int number;
    private int prettiness, weight;
    private String name, meow;

     public boolean play(){
         return amIHungry("Meow! I`m playing!");
     }

    public boolean sleep(){
        return amIHungry("Meow! Zzz...");
    }

    public boolean chaseMouse(){
        return amIHungry("Meow! I`m good hunter!");
    }

    public boolean afraid(){
            return amIHungry("Meow! I`m afraid!");
    }

    public boolean sizzle(){
        return amIHungry("SSShhh!");
    }

    public void liveAnotherDay(){
        for (int i=0; i<24;i++){
            switch ((int)(Math.random()*5 + 1)){
                case 1: play();
                    break;
                case 2: sleep();
                    break;
                case 3: chaseMouse();
                    break;
                case 4: afraid();
                    break;
                case 5: sizzle();
                    break;
            }

        }
    }

    private boolean amIHungry(String say){
        if (satiety>0){
            System.out.println(say);
            return true;
        }else{
            System.out.println("I don't want doing it, I want eat!");
            return false;
        }
    }

    public void eat(int food){
        satiety += food;
        System.out.println("I`m " +satiety + " eat");
    }

    public void eat(String nameFood , int food ){
        satiety += food;
        System.out.println("I`m " +satiety + " eat");
    }

    public void eat(){
        eat("ham",10);
    }

    public Kotik(){
        number++;
    }

    public Kotik(int prettiness, String name, int weight, String meow){
         this.prettiness = prettiness;
         this.name = name;
         this.weight = weight;
         this.meow = meow;
        number++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public int getPrettiness(){
         return prettiness;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public String getMeow(){
        return meow;
    }

    public int howManyKotiks(){
        return number;
    }

}
