package Constractor;

public class Computer {
    /*
    create a computer class
    - have instance field of price of the computer
    - create a calculator method to find the total price of 4 computers
    - this method will take an array as a parameter which represents prices of those 4 computers
    - this method will return the total price

    - create two constructor
    - one with no args
    - one with args to int the instance variable

 override the toString method to show price of the computer
     */

    double price;

    public Computer() {
        System.out.println("This is NO argument constructor");
    }

    public Computer(double price) {
        this.price = price;
        System.out.println("This is one argument constructor");
    }

    public static double calculator(double[] priceOfComputers) {
        double totalPrice = 0;
        for (double price : priceOfComputers) {
            totalPrice += price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "" + price;
    }

    public static void main(String[] args) {
        double[] array = {1.2, 2.3, 4.5, 8.6};
        double total = calculator(array);
        System.out.println(total);

        Computer c1 = new Computer();
        System.out.println(c1);
    }


}
