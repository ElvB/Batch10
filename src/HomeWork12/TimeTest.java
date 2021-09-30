package HomeWork12;

public class TimeTest {
    public static void main(String[] args) {

        Time tm = new Time();
        System.out.println(tm.seasons(3));
        tm.printTime(4, 55, 58);
        tm.printDate(11, 2021);
        System.out.println(tm.toString());
    }
}
