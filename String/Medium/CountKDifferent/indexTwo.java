package String.Medium.CountKDifferent;

import java.util.HashMap;

public class indexTwo {

    public static int slidingWindow(int k, String s) {
       
        int left = 0, totalCount = 0, uniqueChar = 0;
        
        HashMap<Character, Integer> ht = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            
            ht.put(s.charAt(i), ht.getOrDefault(s.charAt(i), 0) + 1);

            if (ht.get(s.charAt(i)) == 1) uniqueChar++;

            while (uniqueChar > k) {
                
                Character leftCh = s.charAt(left);

                ht.put(leftCh, ht.get(leftCh) - 1);

                if (ht.get(leftCh) == 0) {
                    ht.remove(leftCh);
                    uniqueChar--;
                }

                if (uniqueChar == k) {
                    totalCount++;
                    System.out.println(ht.keySet().toString());
                }

                left++;
            }

            if (uniqueChar == k) {
                totalCount++;
                System.out.println(ht.keySet().toString());
            }
        }

        return totalCount;
    }

    public static void main(String args[]) {

        String s = "aacfssa";
        int k = 3;
        System.out.println(slidingWindow(k, s));

    }
}
