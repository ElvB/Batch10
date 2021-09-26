package IfStatement;

import java.util.Scanner;

public class ElseIfPractice1 {
    public static void main(String[] args) {
        /*
There is a course that user need to pass
User got three test scores for this course
To be able to print/show users Letter grade
-Ask User to provide those three test scores as integer between 0 to 100
-find the average of the provided test scores
-Based on the average score
- if the average is 90 to 100 --> print 'Your average test score is <average> and letter grade is A'
- if the average is 80 to 89 --> print 'Your average test score is <average> and letter grade is B'
- if the average is 70 to 79 --> print 'Your average test score is <average> and letter grade is C'
- if the average is 60 to 69 --> print 'Your average test score is <average> and letter grade is D'
- if the average is less than 60 --> 'You need to take this course again!!'
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your 3 test score between 0 to 100");
        int firstScore = scanner.nextInt();
        //       System.out.println("Please enter your 2d score as a whole number");
        int secondScore = scanner.nextInt();
        //       System.out.println("Please enter your 3d score as a whole number");
        int thirdScore = scanner.nextInt();

        int average = (firstScore + secondScore + thirdScore) / 3;

        if (average >= 90 && average <= 100) {
            System.out.println("Your average test score is " + average + " and letter grade is A");
        } else if (average >= 80 && average < 90) {
            System.out.println("Your average test score is " + average + " and letter grade is B");
        } else if (average >= 70 && average < 80) {
            System.out.println("Your average test score is " + average + " and letter grade is C");
        } else if (average >= 60 && average < 70) {
            System.out.println("Your average test score is " + average + " and letter grade is D");
        } else {
            System.out.println("You need to take this course again!!!");
        }
    }

}
