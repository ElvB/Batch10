package Switch;

import java.util.Locale;

public class Practice2 {
    public static void main(String[] args) {

        String name = "Luna".toLowerCase().toUpperCase();

        switch (name) {
            default:
                System.out.println("The student is not here");
                break;
            case "Alex":
                System.out.println("Alex is here");
                break;
            case "David":
                System.out.println("David is here");
                break;
            case "luna":
                System.out.println("luna is here");
                break;

        }
    }
}
