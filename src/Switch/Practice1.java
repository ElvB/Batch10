package Switch;

public class Practice1 {
    public static void main(String[] args) {

        int number = 15;

        switch (number) {
            case 3:
                System.out.println("First");
                break; // we have put "break" after each case
            case 25:
                System.out.println("Second");
                break;
            case 5:
                System.out.println("Third");
                break;
            case 11:
                System.out.println("Forth");
                break;
            default: // we can put default anywhere between the lines as long as you have break after a case,
                     // but if we put it in the middle we have to put break after default. But common usage putting it at the end
                System.out.println("This is default");
        }

    }
}
