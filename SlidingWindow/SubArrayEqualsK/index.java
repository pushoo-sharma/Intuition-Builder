package SlidingWindow.SubArrayEqualsK;

import java.util.HashMap;

public class index {
    
    public static int subArraySumK(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        
        int sum = 0, count = 0;
        
        freq.put(0, 1);

        for(int n : nums) {
            
            sum += n;
            
            count += freq.getOrDefault(sum - k, 0); 

            freq.put(sum, freq.getOrDefault(sum, 0) + 1);

        }

        return count;

    }

    public static void main(String args[]) {
        int[] nums = {1,2,3};
        int sum = 3;
        System.out.println(subArraySumK(nums, sum));
    }
}
