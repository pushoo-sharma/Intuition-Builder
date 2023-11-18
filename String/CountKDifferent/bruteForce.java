package String.CountKDifferent;

import java.util.Arrays;

public class bruteForce {
    
    public static int checkDist(String s, int k) {

        int disctictCount = 0, totalCount = 0;
        int[] arrCount = new int[26];

        for(int i = 0; i < s.length(); i++) {

            disctictCount = 0;
            Arrays.fill(arrCount, 0);

            for(int j = i; j < s.length(); j++) {

                if(arrCount[s.charAt(j) - 'a'] == 0) disctictCount++;
                arrCount[s.charAt(j) - 'a']++;
                if(disctictCount == 3) {
                    totalCount++;
                } 

            }

        }

        return totalCount;

    }


    public static void main(String args[]) {
        
        String s = "aacfssa";
        int k = 3;

        System.out.println(checkDist(s, k));

    }
}
