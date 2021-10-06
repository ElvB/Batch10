package MAP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountAndStoreTask {
    public static void main(String[] args) {

        String[] brand = {"Nike", "Adidas", "Reebok", "Puma", "Armani", "Clarks", "Nike", "Puma", "Puma"};

        // how many of each I have
        // nike -- 2
        // adidas -- 1
        // reebok -- 1
        // puma -- 3
        // ....

        HashMap<String, Integer> brandCount = new HashMap<>();

        for (int i = 0; i < brand.length; i++) {

            if (!brandCount.containsKey(brand[i])) {
                brandCount.put(brand[i], 1);
            } else {
                // int count = brandCount.get(brand[i]);
                brandCount.put(brand[i], brandCount.get(brand[i]) + 1);
            }
        }
        System.out.println(brandCount);

    }
}
