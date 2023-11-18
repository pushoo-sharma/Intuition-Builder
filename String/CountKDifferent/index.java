package String.CountKDifferent;

import java.util.HashMap;

public class index {

    public static int slidingWindow(int k, String s) {
        
        int left = 0, totalCount = 0, uniqueChar = 0;

        HashMap<Character, Integer> ht = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            ht.put(s.charAt(i), ht.getOrDefault(s.charAt(i), 0) + 1);

            if(ht.get(s.charAt(i)) == 1) uniqueChar++;

            if(uniqueChar == k) {
                totalCount++;
                System.out.println(ht.toString());
            }
           

            while(uniqueChar >= k) {

                Character leftCh = s.charAt(left);

                ht.put(leftCh, ht.get(s.charAt(i)) - 1);

                if(ht.get(leftCh) == 0) {
                    ht.remove(leftCh);
                    uniqueChar--;
                }

                left++;

                if(uniqueChar == k) {
                    totalCount++;
                    System.out.println(ht.toString());
                }
            }

        }

        return totalCount;

    }
    
    public static int countSubstring(int k, String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        
        int count = 0, totalCount = 0;

        for(int i = 0; i < s.length() - k ; i++) {
            hm = new HashMap<>();
            count = 0;
            for(int j = i; j < s.length(); j++) {
                if(hm.containsKey(s.charAt(i))) {
                    hm.put(s.charAt(j), 1);
                    count++;
                } else {
                    hm.put(s.charAt(j), hm.getOrDefault(s.charAt(i), 0) + 1);
                }
                if(count == k) {
                    System.out.printf(hm.keySet().toString());
                    totalCount++;
                    break;
                } 
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
