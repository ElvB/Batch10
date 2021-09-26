package IfStatement;

public class CurlyBracketPractice {
    public static void main(String[] args) {

        /*
        appleNumber = 20;
        orangeNumber = 30;
         */

        int appleNumber = 40;
        int orangeNumber = 30;
        if (appleNumber > orangeNumber) {
            appleNumber++;
            System.out.println("There are more apples in the store than oranges " + appleNumber);
        }
        if (orangeNumber > appleNumber) { // if there is no brackets {} and the statement is FALSE it affects only next line,
            orangeNumber++; // it will affect only this line if there is no {} after if
            ++orangeNumber; // orangeNumber++ тоже самое // it will not affect that line
            System.out.println("There are more oranges in the store than apples " + orangeNumber);
        }
    }
}
