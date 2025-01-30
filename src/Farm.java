import Animals.Animal;
import Animals.Size;
import Flowers.Flower;

import java.util.ArrayList;

public class Farm {
    private int bankAccont;
    private int FieldSize = 100;

    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Flower> flowers = new ArrayList<>();

    public void plantFlower(Flower flower) {
        if (FieldSize - flower.getNeededArea()> 0){
            if (bankAccont> flower.getPrice()){}
            flowers.add(flower);
            FieldSize -= flower.getNeededArea();
            bankAccont -= flower.getPrice();
        }
    }

    public void watering(Flower flower) {
        if (flowers.contains(flower)){
            if (bankAccont>10) {
                System.out.println(flower.watering());
                bankAccont -= 10;
            }
        }
    }

    public void sellFlower(Flower flower) {
        if (flowers.contains(flower)){
            flowers.remove(flower);
            bankAccont += flower.getPrice()+(flower.getNeededArea()*10);
        }
    }

    public void buyAnimal(Animal animal) {
        int small = 0;
        int big = 0;

        for (Animal a : animals) {
            if (a.getSize() == Size.SMALL) {
                small++;
            } else if (a.getSize() == Size.BIG) {
                big++;
            }
        }

        if (animal.getSize() == Size.SMALL) {
            if (small > 10) {
                if (bankAccont > 1000) {
                    animals.add(animal);
                    bankAccont -= 1000;
                }
            }
        } else if (animal.getSize() == Size.BIG) {
            if (big > 10) {
                if (bankAccont > 10000) {
                    animals.add(animal);
                    bankAccont -= 10000;
                }
            }
        }
    }

    public void petAnimal(Animal animal) {
       if (animals.contains(animal)) {
           animal.setSpecialCare(null);
       }
    }

    public void sellAnimal(Animal animal) {
        if (animals.contains(animal)) {
            if (animal.getSize() == Size.SMALL) {
                animals.remove(animal);
                bankAccont += 1200;
            } else if (animal.getSize() == Size.BIG) {
                animals.remove(animal);
                bankAccont += 12000;
            }
        }
    }

}
