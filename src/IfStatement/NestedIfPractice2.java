package IfStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {
        /*
         Ask a candidate
         if she or he knows Java
            if yes --> ask if he/she knows Selenuim
                 if yes --> ask if he/she knows API testing
                     if yes --> if he/she knows SQL
                        yes >> Congrats! You are hired!
         if Java is no     >> Please learn Java and come back
         if Selenium is no >> print we need who has Selenium knowledge
         if API is no      >> we need someone who knows API testing
         if SQL is no      >> we need who has SQL knowledge
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Do you know Java? Yes/No");
        String java = input.next();
        if (java.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Selenium?");
            String selenium = input.next();
            if (selenium.equalsIgnoreCase("yes")) {
                System.out.println("Do you know API Testing?");
                String api = input.next();
                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("Do you have SQL knowledge?");
                    String sql = input.next();
                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("Congrats!! You are Hired!!!");
                    } else {
                        System.out.println("We need someone who has SQL knowledge");
                    }
                } else {
                    System.out.println("We need someone who knows API testing");
                }
            } else {
                System.out.println("We need someone who has Selenium knowledge");
            }
        } else {
            System.out.println("Please learn Java first and come back");
        }
    }
}
