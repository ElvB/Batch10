package Array;

public class Task3 {
    public static void main(String[] args) {
        String[] colors = {"Red", "Yellow", "brown", "Blue", "White", "Orange", "Green", "Pink", "Violet", "Black"};

        // print out every element in reverse order --> red= der, yellow = wolley


        for (String color : colors) {
            String reverse = "";
            for (int i = color.length() - 1; i >= 0; i--) {
                reverse = reverse + color.charAt(i);
            }
            System.out.print(reverse + ", ");
        }


    }
}
