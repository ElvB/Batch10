package Methods;

public class BodyIndex {
    // Let's do for kg and meter

    public double bmi(int kg, double meter) {
        // we need to divide kg to square of meter
        double squareMeter = meter * meter;
        return kg / squareMeter;
    }

    // we are asked to calculate body index for US
    public double bmi(int pound, int feet, int inch) {
        double kg = pound * 0.45;
        double meter = (feet * 0.3) + (inch * 0.025);
        double squareMeter = meter * meter;
        return kg / squareMeter;
    }

    public static void main(String[] args) {
        BodyIndex bodyIndex = new BodyIndex();
        System.out.println(bodyIndex.bmi(79,1.8));
        System.out.println(bodyIndex.bmi(174, 5,10));

    }
    /*
    What is overloading?
    Same method name different parameters
    If method name is same and parameters are different it is overloading
    Access modifier, static or non-static or return type is not important for overloading
     */
    /*
    Advantages of overloading
    It increase the readability of the code
    It is more flexible, so we can call same method with different parameters
    Code looks cleaner
    We can use the same method which saves memory for us.
    It increases the reusability of the code
     */

}
