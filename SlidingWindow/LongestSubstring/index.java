package SlidingWindow.LongestSubstring;

import java.util.HashMap;

public class index {
    
    public static int solve(String str) {

        HashMap<Character, Integer> hm = new HashMap<>();

        int count = 0, itrStart = 0;

        for(int i = 0; i < str.length(); i++) {
            
            if(hm.containsKey(str.charAt(i))) {

                itrStart = Math.max(hm.get(str.charAt(i)) + 1, itrStart);

            } 

            count =  Math.max(i - itrStart + 1, count);
            hm.put(str.charAt(i), i);

        }

        return count;
    
    }

    public static void main(String args[]) {
        String str = "tmmzuxt";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
    }
}
