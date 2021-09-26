package Methods;

public class Netflix {

    /*
    create instance fields: accountName, userName, monthlyData
    - create a method that will update the usage of the data for each user
    this method will take a parameter for amount of data usage
     */

    String accountName;
    String useName;
    static double monthlyData = 200;

    public void usage(double data) {
        monthlyData = monthlyData - data;
    }

    public static void main(String[] args) {
        Netflix updatedUsage = new Netflix();
        updatedUsage.usage(10);
        System.out.println(monthlyData);
        System.out.println(updatedUsage.accountName);

        Netflix net = new Netflix();
        net.usage(5);
        System.out.println(net.monthlyData);
    }

}
