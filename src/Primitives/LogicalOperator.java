package Primitives;

public class LogicalOperator {
    public static void main(String[] args) {

        // && --> AND
        // || --> OR

        int myAge = 15;
        boolean myDress = true;

        int ageReq = 21;
        boolean dressCode = true;

        boolean can_I_Attend = myAge >= ageReq && myDress == dressCode;

        System.out.println(can_I_Attend);

        //=================================================================================

        // to be able to attend the event you need to be age of 18 or older OR pay $100

        int myNewAge = 28;
        boolean myMoney = false;
        int ageRequirement = 18;
        boolean moneyReq = true;

        boolean canIGo = myNewAge >= ageRequirement || myMoney == moneyReq;

        System.out.println(canIGo);

    }
}

