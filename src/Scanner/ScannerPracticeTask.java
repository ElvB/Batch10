package Scanner;

import java.util.Scanner;

public class ScannerPracticeTask {
    public static void main(String[] args) {

        /* David wants to deposit his money into his bank account
        - he already got $200 in his account
        - he got three different paychecks ($480, $600 and $350)
        - he can only deposit one paycheck at a time
        - after he got his all money in the account
        - he bought a phone for $599 and headphone for $299
        - calculate his final money in his account */

        Scanner input = new Scanner(System.in);
        int whatHeHas = 200;

        System.out.println("How much do you want to deposit?");
        double firstDeposit = input.nextDouble();

        System.out.println("How much do you want to deposit 2nd time?");
        double secondDeposit = input.nextDouble();

        System.out.println("How much do you want to deposit 3d time");
        double thirdDeposit = input.nextDouble();

        double totalMoney = (whatHeHas+firstDeposit+secondDeposit+thirdDeposit);

        System.out.println("Your total is " + totalMoney);

        System.out.println("Please enter a phone price");
        double phonePrice = input.nextDouble();

        System.out.println("Please enter a headphone price");
        double headPhonePrice = input.nextDouble();

        System.out.println("Your balance now after spending is " + (totalMoney - phonePrice-headPhonePrice));

//        Scanner input = new Scanner(System.in);
//        int davidMoney = 200;
//        System.out.println("Please deposit your first check");
//        int firstCheck = input.nextInt();
//        System.out.println(" Your total money is " +(davidMoney + firstCheck));
//        davidMoney += firstCheck;
//        System.out.println("Please deposit your second check");
//        int secondCheck = input.nextInt();
//        System.out.println(" Your total money is " +(davidMoney + secondCheck));
//        davidMoney += secondCheck;
//        System.out.println("Please deposit your third check ");
//        int thirdCheck = input.nextInt();
//        System.out.println("Your total money is " + (davidMoney + thirdCheck));
//        davidMoney += thirdCheck;
//        System.out.println("Please enter the price of phone");
//        int firstSpend = input.nextInt();
//        System.out.println("Your total money is " + (davidMoney-firstSpend));
//        davidMoney = davidMoney - firstSpend;
//        System.out.println("Please enter the price of headphone");
//        int secondSpend = input.nextInt();
//        System.out.println("Your total money is " + (davidMoney-secondSpend));
//        davidMoney -= secondSpend;
//        System.out.println(davidMoney);


    }
}
