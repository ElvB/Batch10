package Loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        /*
        Use For Loop to create a multiplication table for number 6
        from 1 to 0
        6*1= 6
        6*2 = 12
        ....
        6*10 = 60
         */
        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        // Use For Loop to create a multiplication table for number 1 to 10

        for (int num1 = 1; num1 <= 10; num1++) {

            for (int num2 = 1; num2 <= 10; num2++) {

                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
            }
        }

        // perfect number: a number is equals to its dividers' (except the number itself) sum

        // 6 >> 1,2,3 >> 1+2+3 =6; 6 = 6 is the perfect number

        int perfect$ = 28;
        int sum = 0;

        for (int divisor = 1; divisor < perfect$; divisor++) {
            if (perfect$ % divisor == 0) {
                sum = sum + divisor;
            }
        }

        System.out.println("The sum of the divisors is >> "+sum);
        if (perfect$== sum){
            System.out.println("The number "+perfect$ + " is a perfect number");
        }else {
            System.out.println("The number "+perfect$ + " is not a perfect number");
        }
    }
}
