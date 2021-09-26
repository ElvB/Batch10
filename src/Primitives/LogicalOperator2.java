package Primitives;

public class LogicalOperator2 {

    public static void main(String[] args) {
        // there is an event for kids, they must be 5 or older than 5, 12 or younger 12
        // the other requirement is their height needs to be 46" or more to be able to attend

        int kidAge = 2;
        int kidHeight = 36;

        int minAge = 5;
        int maxAge = 12;
        int reqHeight = 46;

        boolean canKidGo = (kidAge >= minAge && kidAge <= maxAge) && kidHeight >= reqHeight;

        System.out.println(canKidGo);


    }
}
