package Loops;

public class NestedPractice {
    public static void main(String[] args) {

        /*
        Print the months for thr every year for the years from 2020 to 2023
        2020
        1,2,3 .............12

        2021
        1,2,3..............12

        2022
        1,2,3..............12

        2023
        1,2,3..............12
         */

        for (int year = 2020; year <= 2023; year++) {

            for (int months = 1; months <= 12; months++) {;
                System.out.println(year + " year  - " + months + " month");
            }

        }

    }
}