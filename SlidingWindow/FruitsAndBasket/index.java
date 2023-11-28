package SlidingWindow.FruitsAndBasket;

import java.util.HashMap;

public class index {
    
    public static int findMaxFruits(int []arr, int n) {
        
        int start = 0, count = 0;
        HashMap<Integer, Integer> st = new HashMap<>();
       
        for(int i = 0; i < arr.length; i++) {

            // added in the set
            st.put(arr[i], i);

            while( st.size() > n ) {

                // contains
                start = Math.max(st.get(arr[start]), start);

                if(st.get(arr[start]) >= start){
                    start = st.get(arr[start]);
                    st.remove(arr[start]);
                    start++;
                }

            }

            count = Math.max(i - start + 1, count);

            // System.out.println(count);

        }

        return count;

    }

    public static void main(String args[]) {

        int[] arr = { 1, 1, 2, 3};
        int bracket = 2;
        System.out.println(findMaxFruits(arr, bracket));

    }

}
