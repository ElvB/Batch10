package Variables;

public class Practice3 {
    public static void main(String[] args){

        int apple; // Declaring the variable which means giving the data type and name

        apple=25; // Initializing the variable which is assigning the value for it

        int banana = 2; // Declaring and Initializing in one line

        System.out.println("Number of apples: "+apple);//25

        apple=23; // Reassigning the value for variable (changing the value of variable)
        System.out.println("Number of apples: "+apple);//23 because it takes the latest number

        int $apple=10;
        int _apple=11;
        int apple$=12;
        int apple_=13;
        //int %apple=15; compile time error
        // int 2apple =16; compile time error
        int apple2=17; // you cannot start name of a variable with number but you can end it with a number
        int a$$le=18;

        // there are 23 apples and 2 bananas
        int applePrice=3;
        int bananPrice=2;

        int totalApplePrice= apple*applePrice;
        int totalBananaPrice= banana*bananPrice;

        System.out.println(totalApplePrice+totalBananaPrice+ " is your total payment");

        int payment = totalApplePrice+totalBananaPrice;
        System.out.println(payment);




    }
}
