package SET;

import java.util.*;

public class Practice3 {

    public static void main(String[] args) {
        // you are given an Array of colors
        // find out and store duplicate elements Array list from this array

        // String[] colors = {"red", "black", "black", "white", "red", "orange"};

        String[] colors = {"red", "black", "black", "white", "red", "orange"};

       List list = Arrays.asList(colors);

        HashSet hashSet = new HashSet(list);
        HashSet hashSet1 = new HashSet(Arrays.asList(colors));
        System.out.println(hashSet);
        System.out.println(list);

        ArrayList list2 = new ArrayList();
        HashSet set2 = new HashSet();

        for (String color: colors){
            if (!set2.add(color)) {
                list2.add(color);
            }
        }
        System.out.println(list2);
    }
}
