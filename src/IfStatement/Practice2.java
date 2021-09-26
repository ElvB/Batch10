package IfStatement;

public class Practice2 {
    public static void main(String[] args) {

    int age = 12;
    double money = 200;

    if (age >= 18){ // it is false it will not be printed

        System.out.println("You can go to picnic");
    }

    if (money>=100){

        System.out.println("You can go to picnic with this amount " + money);
    }
// Combine these two conditions to create an if statement which will accept either of conditions age or money
// print "You are okay with one of the requirements"

        if (age >= 18 || money >= 100){

            System.out.println("You are okay with one of the requirements: " + age + " ," + money);

        }
    }
}
