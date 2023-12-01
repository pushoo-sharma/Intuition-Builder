package SlidingWindow.BinarySubArrayWithSum;

import java.util.HashMap;

public class index {

    public static int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer, Integer> hmt = new HashMap<>();

        hmt.put(0, 1);

        int count = 0, sum = 0;

        for(int a : nums) {

            sum += a;

            count += hmt.getOrDefault(sum - goal, 0);
            
            hmt.put(sum, hmt.getOrDefault(sum, 0) + 1);

        }

        return count;
        
    }
    
    public static void main(String args[]) {
        int[] nums = {0,0,0,0,0};
        int goal = 0;
        System.out.println(numSubarraysWithSum(nums, goal));
    }

}


//    1 0 1 0 1
//    1 1 2 2 3

// 1 1 