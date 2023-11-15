package String.Medium.SortCharaFrequency;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class index {

    public static String frequencySort(String s) {

        HashMap<Character, Integer> ht = new LinkedHashMap<>();

        char[] strItr = s.toCharArray();
         
        // Iterate and store the frequency 
        for(Character c : strItr) {
            if(ht.containsKey(c)) {
                ht.put(c, ht.get(c) + 1);
            } else {
                ht.put(c, 1);
            }
        }

        List<Map.Entry<Character, Integer>> srt = new ArrayList<>(ht.entrySet());
        
        srt.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> m1, Map.Entry<Character, Integer> m2) {
                return m2.getValue().compareTo(m1.getValue());
            }
        });

        StringBuilder st = new StringBuilder();

        for(Map.Entry<Character, Integer> er : srt) {
            
            Character keyStr = er.getKey();
            int valueStr = er.getValue();

            while(valueStr > 0) {
                st.append(keyStr);
                valueStr--;
            }

        }

        return st.toString();

    }
    
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

}
