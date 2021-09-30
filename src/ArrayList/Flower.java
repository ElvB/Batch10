package ArrayList;

import java.util.ArrayList;

public class Flower {

    String color;
    String name;
    int numberOfPetals;
    double price;


    public Flower(String color, String name, int numberOfPetals, double price) {
        this.color = color;
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPetals=" + numberOfPetals +
                ", price=" + price +
                '}';
    }
// create a few flower object and store them in arraylist

    public static double price(ArrayList<Flower> flowers) {

        double total = 0;
        for (int i = 0; i < flowers.size(); i++) {
            total += flowers.get(i).price;

        }
        return total;

    }

    public static void main(String[] args) {

        ArrayList<Flower> flowers = new ArrayList();

        Flower fl1 = new Flower("red", "rose", 12, 3.99);
        Flower fl2 = new Flower("yellow", "rose", 11, 4.99);
        Flower fl3 = new Flower("pink", "rose", 10, 5.99);

        flowers.add(fl1);
        flowers.add(fl2);
        flowers.add(fl3);
        System.out.println(flowers);

        System.out.println(fl3.price);
        System.out.println(flowers.get(2).price);
        System.out.println(price(flowers));


        // create a method that will take an arraylist as a parameter
        // this method will return total prices of the flowers

    }




}
