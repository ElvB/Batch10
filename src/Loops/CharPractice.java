package Loops;

public class CharPractice {
    public static void main(String[] args) {

        //Print out the alphabet in Upper case Letters

        for (char ch = 'A', ch1 = 'a'; ch <= 'Z' && ch1 <= 'z'; ch++, ch1++) {
            System.out.print(ch + "-");
            System.out.print(ch1 + "-");
        }
    }

}

