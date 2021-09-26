package Methods;

public class OverLoadingPractice {

    // create a method that will take two double parameters
    // this method will be named as areaCalculator
    // it will return the area  of rectangle
    // formula >> A = length * width

    public double areaCalculator(double a, double b) {
        double area = a * b;
        return area;
        // return a*b; --> this is also fine as well
    }
    //calculate the area for a square
    // formula>> A = l*w

    public double areaCalculator (double length){
        double area = length*length;
        return area;
    }


    public static void main(String[] args) {
        OverLoadingPractice object = new OverLoadingPractice();

        System.out.println(object.areaCalculator(1.2, 3.4));

        double area = object.areaCalculator(3,4.5);
        System.out.println(area);

    }
}
