package String.Medium.RomanToInteger;

import java.util.*;

public class index {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> ht = new LinkedHashMap<>();

        ht.put('I', 1);
        ht.put('V', 5);
        ht.put('X', 10);
        ht.put('L', 50);
        ht.put('C', 100);
        ht.put('D', 500);
        ht.put('M', 1000);

        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            
            if(i + 1 < s.length() && ht.get(s.charAt(i)) < ht.get(s.charAt(i + 1))) {
                count = count + ht.get(s.charAt(i + 1)) - ht.get(s.charAt(i));
                i++;
            } else {
                count = count + ht.get(s.charAt(i));
            }

        }

        return count;

    }
    

    public static void main(String args[]) {

        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
        
    }

}
