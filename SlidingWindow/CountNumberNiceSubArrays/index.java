package SlidingWindow.CountNumberNiceSubArrays;

import java.util.HashMap;


public class index {

    public static int numSubarraysWithSum(int[] nums, int k) {

        HashMap<Integer, Integer> htm = new HashMap<>();

        int sum = 0, count = 0;

        htm.put(0, 1);

        for(int a : nums) {
            sum += a%2;
            count += htm.getOrDefault(sum - k, 0);
            htm.put(sum, htm.getOrDefault(sum, 0) + 1);
        }

        return count;
        
    }

    public static void main(String args[]) {
        int[] nums = {1,1,2,1,1};
        int goal = 3;
        System.out.println(numSubarraysWithSum(nums, goal));
    }

}
