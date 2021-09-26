package Loops;

public class ForLoop1 {
    public static void main(String[] args) {

        for (int number = 1; number <= 5; number++) {

            System.out.println("it is for LOOP " + number);

        }
        int number = 1;
        for (; number < 5; number++) {

            System.out.println("it is 2nd for LOOP " + number);
        }

        for (; number < 10; ) { //condition MUST stay in the middle
            number++;
            System.out.println("it is 3d for LOOP " + number);
        }

    }
}
