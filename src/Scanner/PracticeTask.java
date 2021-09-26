package Scanner;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {

        /* by using scanner
        ask user to provide their height and weight
        and calculate their BMI (body mass index)
        Formula --> BMI = weight / (height * height)
         */

        Scanner bodyMeasurement = new Scanner(System.in);

        System.out.println("Please enter your height in meters");
        double height = bodyMeasurement.nextDouble();

        System.out.println("Please enter your weight");
        double weight = bodyMeasurement.nextDouble();

        double bmi = weight / (height*height);

        System.out.println("Your BMI is "+bmi);




        }


    }
