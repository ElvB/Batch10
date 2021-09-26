package Array;

import java.util.Arrays;

public class MultiDimensional2 {
    public static void main(String[] args) {

        String[][] states = new String[3][2];

        states[0][0] = "NY";
        states[0][1] = "PA";
        states[1][0] = "Il";
        states[1][1] = "OH";
        states[2][0] = "CA";
        states[2][1] = "WA";
        System.out.println(Arrays.deepToString(states));
        // create for loop to print these states
        System.out.println("--------------------------");
        String[] stateEmails = new  String[6];
        int c = 0;
        for (int i = 0; i < states.length; i++) {
            for (int x = 0; x < states[i].length; x++) {
                stateEmails[c] = states[i][x].toLowerCase() + "@info.com";
                System.out.println(states[i][x]);
                c++;
            }
        }
        System.out.println("======================================");
        // create for each loop to print these states in 2 mins

        for (String[] states1 : states) {
            for (String st : states1) {
                System.out.println(st);
            }
        }
        // print these states in lower case

        for (String[] states1 : states) {
            for (String st : states1) {
                System.out.println(st.toLowerCase());
            }
        }
        // for each state create email --> ny@info.com
        // and store these addresses in an array

        for (String[] states1 : states) {

            for (String st : states1) {

                System.out.println(st.toLowerCase() + "@info.com");
            }
        }
    }
}

