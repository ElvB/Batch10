package Methods;

public class MathTest {
    public static void main(String[] args) {

        Math object = new Math();

        object.sum(4,6);
        object.sum(5,25);

        object.operation("multiply", 4, 2);
        object.operation("subtract", 2,3);
        object.operation("gfhjgj",5,6);

        int x = object.sum1(1,3,6);

        System.out.println(x+25);

        // int w = object.sum(2,3 ); void return type does not return any value,
                                    // that is why you can not store the outcome into any variable

    }
}
