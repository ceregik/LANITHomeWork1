package LANITHomeWork2.food;

public abstract class Food {
    private String name;
    private int satiety;

    public String getName() {
        return name;
    }

    public int getSatiety() {
        return satiety;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setSatiety(int satiety) {
        this.satiety = satiety;
    }


}
