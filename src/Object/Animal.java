package Object;

public class Animal {

    String name = "Jerry";
    int age;
    double weight;
    int legNUmber;
    double energy;
    String destination;

    // access modifier    return type       name of method      u can pass parameter(s)
    public void run(String destination) {
        energy -= 10;
        System.out.println(name + " Animal is running " + destination);
        {


        }
        // create a sleep method and print >> "...is sleeping"
        //make every animal sleep

    }

    public void sleep() {
        energy = 100;
        System.out.println(name + " is sleeping");

    }
//create "printInfo() method to print out all information
    // about the animal

    public void printInfo() {
        System.out.println(name + " is name, " + age + " is age, " + weight + " is weight, " + legNUmber + " is leg number, " + energy + " energy");
    }

}