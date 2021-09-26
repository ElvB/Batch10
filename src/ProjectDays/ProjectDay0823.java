package ProjectDays;

public class ProjectDay0823 {
    public static void main(String[] args) {
         /*   TASK 2
         Write program will add up the value of a number of quarters,dimes,nickels,and pennies.
         The number of each type of coin is input by the user.The total value is printed in dollars.
         Example: Quarters 5, Dimes 4, Nickels 3, Pennies 2.
         The total in dollars is $1.82
          */
        int quantityOfQuarters = 11;
        int quantityOfDimes = 0;
        int quantityOfNickels = 2;
        int quantityOfPennies = 1;
        double quarter = 0.25;
        double dime = 0.1;
        double nickel = 0.05;
        double penny = 0.01;
        double totalDollars = (quantityOfQuarters * quarter) + (quantityOfDimes * dime) + (quantityOfNickels * nickel) + (quantityOfPennies * penny);

        System.out.println("The total in dollars is " + totalDollars);

        /* TASK 3
        I need to write a program that will take a given amount of money and return the number of dollars in quarters,
        dimes,nickels,and pennies that make up that given amount
        Example:
        Please enter your balance:2.36$
        2.36 will make 9 quarters 1 dime 0nickels and 1pennies */

        double givenAmount = 5.15;

        int balance1 = (int) (givenAmount * 100);

        double quarters = balance1 / 25;
        balance1 = balance1 % 25;

        double dimes = balance1 / 10;
        balance1 = balance1 % 10;

        double nickels = balance1 / 5;
        balance1 = balance1 % 5;

        double pennies = balance1 / 1;


        System.out.println(givenAmount + " will make " + quarters + " quarters," + dimes + " dimes,"
                + nickels + " nickels," + pennies + " pennies");


    }


}
