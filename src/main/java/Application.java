import model.Kotik;

public class Application {
    public static void main(String[] args){
        Kotik kotik1 = new Kotik();
        Kotik kotik2 = new Kotik(10, "Vlad", 3, "Meeeow");

        System.out.println(kotik2.getWeight());
        System.out.println(kotik2.getPrettiness());

        kotik1.setKotik(9, "Bob", 2, "Meow");

        kotik2.eat(50);
        kotik2.liveAnotherDay();

        kotik1.liveAnotherDay();
        if (kotik1.getMeow().equals(kotik2.getMeow())){
            System.out.println("Cats say meow equally");
        } else {
            System.out.println("Cats say meow not equally");
        }

        System.out.println("Number of cats: " + kotik1.howManyKotiks());
    }

}
