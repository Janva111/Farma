package Flowers;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = 0;
    }

    public String watering(){

        if (chanceOfGrowth<10){
            this.chanceOfGrowth ++;
            return "Not grown"
        }
        return "Grown"
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getNeededArea() {
        return neededArea;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Flowers.Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
