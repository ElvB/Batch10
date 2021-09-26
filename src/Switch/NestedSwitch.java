package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*
        You are making call a company
        there are three departments IT -1, HR -2, REP -3
        In the IT dept: Raj, Alex, Jessi
        In the HR dept: Ana, Tima
        In the REP dept: Jeremiah, John, David
            Ask user "Which department they want to talk to"
            After they choose the department;
                Ask them "Who do you want to talk to?"
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which department you want to talk to: IT press 1, HR press 2, Representative press 3");

        int departmentNumber = scanner.nextInt();

        switch (departmentNumber) {
            case 1: // IT department
                System.out.println("You reached IT dep. Who do you want to talk to? Raj, Alex, Jessi");
                String name = scanner.nextLine();
                switch (name.toLowerCase()) {
                    case "Raj":
                        System.out.println("Transferring to Raj");
                        break;
                    case "alex":
                        System.out.println("Transferring to Alex");
                        break;
                    case "jessi":
                        System.out.println("Transferring to Jessi");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                break;
            case 2:
                scanner = new Scanner(System.in);
                System.out.println("You reached HR dep. Who do you want to talk to? Ana,Tima");
                String hrName = scanner.nextLine().toLowerCase();
                switch (hrName) {
                    case "ana":
                        System.out.println("Transferring to Ana");
                        break;
                    case "tima":
                        System.out.println("Transferring to Tima");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                break;
            case 3:
                scanner = new Scanner(System.in);
                System.out.println("You reached REP dep. Who do you want to talk to? Jeremiah, John, David");
                String repName = scanner.nextLine();
                switch (repName.toUpperCase()) {
                    case "JEREMIAH":
                        System.out.println("Transferring to Jeremiah");
                        break;
                    case "JOHN":
                        System.out.println("Transferring to John");
                        break;
                    case "DAVID":
                        System.out.println("Transferring to David");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                break;
            default:
                System.out.println("Invalid selection for department");
                break;
        }


    }
}
