package Methods;

public class AgeTestClass {
    public static void main(String[] args) {

        AgeCalculator tom = new AgeCalculator();
        tom.ageCalculator(1988);
        tom.ageCalculator(2018,"John");
        String x = tom.ageCalculator(2018, "John");
        System.out.println(x);
    }
}
