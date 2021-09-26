package Primitives;

public class LogicalOperatorPractice {
    public static void main(String[] args) {
        /*
        You need to pass a course
        -you attend 95% or more of the classes or
        - you get 70% as passing score out of 100%
        */

        int attendReq =95;
        int scoreReq = 70;

        int myAttend = 10;
        int myScore = 65;

        boolean didIPass = myAttend >= attendReq || myScore > scoreReq;

        System.out.println("Am I passing "+ didIPass);



    }
}
