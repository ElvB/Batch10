package Methods;

public class AgeCalculator {
    //create a method that will take one int parameter for your birth year and
    // this method simply calculates and prints your age


    public void ageCalculator(int birthYear) {
        int calculator = 2021 - birthYear;
        System.out.println("Your age is " + calculator);
    }

    public void ageCalculator() {
        int age = 2021 - 2015;
        System.out.println("Your age is " + age);
    }
    // overload this method by passing a string parameter which is
    // going to be a name of the person
    // and print out the age of the person as
    // ".... your age is "

    public String ageCalculator(int birthYear, String name) {
        int age = 2021 - 2015;
        //System.out.println(name+" your age is " + age);
        return ""+name+ " ur age is "+age;
    }

}
