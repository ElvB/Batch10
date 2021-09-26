package Loops;

public class HoursMinutes {
    public static void main(String[] args) {

        /*
        create a digital clock that prints hours and minutes
        >> hours from 0 to 12
        >> minutes from 0 to 59
        0:0
        0:1
        0:2
        ....
        11:59
        Skip hours >> 5, 6 and 7 in the execution
        Stop execution for 10 and after 10
         */
        for (int hours = 0; hours < 12; hours++) {

            if (hours>4 && hours<8){ // we do not have to put curly brackets all the time when it is safe we can skip putting curly brackets
                continue;
            }

            for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.println(hours + " : " + minutes);

            }
        }
    }
}
