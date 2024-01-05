package Recursion.Subsequences.Subset;

import java.util.ArrayList;
import java.util.List;

public class index {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> currentSubset, List<List<Integer>> result) {
        
        result.add(new ArrayList<>(currentSubset));

        for(int i = start; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            backtrack(i+1, nums, currentSubset, result);
            currentSubset.remove(currentSubset.size() - 1);
        }

    }

    public static void main(String[] args) {
        index subsetsGenerator = new index();

        // Example 1
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> result1 = subsetsGenerator.subsets(nums1);
        System.out.println("Example 1 Output: " + result1);

        // Example 2
        int[] nums2 = {0};
        List<List<Integer>> result2 = subsetsGenerator.subsets(nums2);
        System.out.println("Example 2 Output: " + result2);
    }
}
