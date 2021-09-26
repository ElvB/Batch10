package MyPractices;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {

        /*
        There is a course that user need to pass
        User got three test scores for this course
        To be able print/show users Letter grade
            - Ask User to provide those three test scores as integer between 0 to 100
            - find the average of the provided test scores
            - Based on the average score
            - if the average is 90 to 100 --> print 'Your average test score is <average> and letter grade is A'
            - if the average is 80 to 89 --> print 'Your average test score is <average> and letter grade is B'
            - if the average is 70 to 79 --> print 'Your average test score is <average> and letter grade is C'
            - if the average is 60 to 69 --> print 'Your average test score is <average> and letter grade is D'
            - if the average is less than 60 --> 'You need to take this course again!'
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the three test scores as integer between 0 to 100");

        int scores = scanner.nextInt();







    }
}
