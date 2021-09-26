package Methods;

public class StaticPracticePet {
    String name;
    int age;
    String color;
    static int foodAmount = 20;

    public void eat() {
        foodAmount -= 1;
        System.out.println("Leftover food is " + foodAmount);
    }

    public static void run() {
      //  static int a = 23; it will not run, bc int a is local variable. Local variable cannot be static
        System.out.println("Cat is running");
    }

    public static void main(String[] args) {
        StaticPracticePet cat = new StaticPracticePet();
        cat.name = "Felix";
        cat.age = 3;
        cat.color = "White";

        cat.eat();

        StaticPracticePet cat1 = new StaticPracticePet();
        cat1.name = "Moorzik";
        cat1.age = 4;
        cat1.color = "Black";

        cat1.eat();
        cat.run(); // 1st method calling
        run(); // 2nd method calling
        StaticPracticePet.run();// 3d method calling with the help of the class name

    }
}
