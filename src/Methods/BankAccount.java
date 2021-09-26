package Methods;

public class BankAccount {

    String bankName = "Techtorial";
    int accountNumber;
    double balance;
    String accountHolderName;
    boolean loggedIn;
    String userName;
    String passWord;

    // create a method that will display all the account info
    // create a method named as deposit, it will update the balance
    // create a method named as withDraw, it will also update the balance
    // create a method named as logIn, it will check if the user logged in or not. it will return true or false

    public void accountInfo() {
        System.out.println("Bank name " + bankName + " \nAccount number is " + accountNumber + "\nAccount holder " + accountHolderName+ loggedIn);
    }

    public double deposit(double deposit) {
        balance += deposit;
        System.out.println("Your new balance is now " + balance);
        return balance;
    }

    public double withdraw(double withdraw) {
        balance -= withdraw;
        System.out.println("Your new balance is now " + balance);
        return balance;
    }

    public boolean logIn(String user, String pass) {

        if (userName.equals(user) && passWord.equals(pass)) {
            System.out.println("You successfully logged in");
            loggedIn = true;
        } else {
            System.out.println("Wrong password or username");
        }
        return loggedIn;

    }

    public static void main(String[] args) {
        BankAccount java = new BankAccount();
        java.accountInfo();
        java.accountNumber = 12345;
        java.accountHolderName = "John";
        java.userName = "abc";
        java.passWord = "123";
        java.balance = 100_000;
        java.accountInfo();
        java.deposit(5000);
        java.withdraw(60);
        java.logIn("abc", "123");

    }
}