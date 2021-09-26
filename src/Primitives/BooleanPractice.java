package Primitives;

import java.util.Enumeration;

public class BooleanPractice {

    public static void main(String[] args) {

// for a boolean data type, you can only give value of true or false
        boolean isLightOn = true;

        boolean isBreakTime;

        isBreakTime = isLightOn;

        System.out.println(isLightOn);
        System.out.println(isBreakTime);

        int num=6;

       int num1= num;
        System.out.println(num1);

        boolean isClear = false;
        System.out.println(isClear);
        //System.out.println(isBreakTime+isClear); it will not compile. you cannot do this
        System.out.println("!!!!"+isBreakTime+isClear);
    }
}
