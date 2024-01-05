package Recursion.Subsequences.SumEqualToK;

import java.util.ArrayList;
import java.util.List;

public class index {

    private static void findSubsequencesWithSumHelper(int[] arr, int sum, int index, List<Integer> subStack, List<List<Integer>> result) {

        if(index == arr.length) {
            
            Integer sumVal = 0;
            
            for(int i : subStack) {
                sumVal += i;
            }

            if(sumVal == sum) {
                result.add(new ArrayList<>(subStack));
            }

            return;

        }

        subStack.add(arr[index]);

        findSubsequencesWithSumHelper(arr, sum, index+1, subStack, result);

        subStack.remove(subStack.size() - 1);

        findSubsequencesWithSumHelper(arr, sum, index+1, subStack, result);
        
    }
    
    private static void findSubsequencesWithSum(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        findSubsequencesWithSumHelper(arr, k, 0, currentList, result);

        if (result.isEmpty()) {
            System.out.println("No subsequences found with sum equal to " + k);
        } else {
            System.out.println("Subsequences with sum equal to " + k + ":");
            for (List<Integer> subsequence : result) {
                System.out.println(subsequence);
            }
        }
    }
    

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        
        int k = 8;

        findSubsequencesWithSum(arr, k);
    }
   
}
