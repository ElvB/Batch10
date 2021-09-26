package Variables;

public class Practice4 {

    public static void main(String[] args){

        /*
        in a farm,
        there are 12 cows and 23 chickens
        each chicken costs is 10$
        each cow costs is 500$
        1 - calculate the total number of legs of the animals in this farm
        2 -calculate the total cost of animals in the farm
         */

        int totalCowsLegs=12*4;
        int totalChickenLegs=23*2;

        System.out.println("Total number of legs in the farm is "+(totalChickenLegs+totalCowsLegs));

        int totalCowsCost=12*500;
        int totalChickenCost=23*10;

        System.out.println("Total cost of animals is "+(totalChickenCost+totalCowsCost));

    }

}
