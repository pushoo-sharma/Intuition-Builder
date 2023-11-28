package SlidingWindow.MaximumConOne;

public class index {
    
    public static int longestOnes(int[] nums, int k) {

        int start = 0, count = 0, total = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {
                count++;
            }


            while(count > k) {

                if(nums[start] == 0) {
                    count--;
                }

                start++;

            }

            total = Math.max(i - start + 1, total);

        }

        return total;
        
    }

    public static void main(String args[]) {

        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;

        System.out.println(longestOnes(arr, k));

    }

}
