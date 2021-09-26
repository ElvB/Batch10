package Object;

import Methods.Math;

public class AnimalTestClass {
    public static void main(String[] args) {

        Animal cat = new Animal();

        cat.name = "Tom";
        System.out.println(cat.name);

        cat.age = 5;
        cat.weight = 8.5;
        cat.legNUmber = 4;

        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.legNUmber);

        //create a DOG object and initialize each variable and print them out

        Animal dog = new Animal();

        dog.name = "Max";
        System.out.println(dog.name);

        dog.age = 6;
        dog.weight = 10.2;
        dog.legNUmber = 4;

        System.out.println(dog.age);
        System.out.println(dog.weight);
        System.out.println(dog.legNUmber);

        Animal bird = new Animal();
        System.out.println(bird.weight);

        //  cat.run();
        dog.run("west");

        cat.sleep();
        dog.sleep();
        bird.sleep();

        cat.printInfo();
        dog.printInfo();
        bird.legNUmber = 2;
        bird.printInfo();
        System.out.println("=======================");
        cat.printInfo();
        cat.energy = 100;
        cat.printInfo();
        cat.run("up");
        cat.run("downstairs");
        cat.printInfo();
        cat.sleep();
        cat.printInfo();

        //==================

        bird.energy = 100;
        bird.sleep();

        bird.run("in to air");

        Math obj1 = new Math();
        obj1.sum(1, 1);

    }


}


