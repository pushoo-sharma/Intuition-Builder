package Recursion.Subsequences.SumEqualToK;

import java.util.ArrayList;
import java.util.List;

public class countSub {
    
    private static int findSubsequencesWithSumHelper(int[] arr, int sum, int index, List<Integer> subStack) {

        if(index == arr.length) {
            
            Integer sumVal = 0;
            
            for(int i : subStack) {
                sumVal += i;
            }

            if(sumVal == sum) {
                return 1;
            }

            return 0;

        }

        subStack.add(arr[index]);

        int left = findSubsequencesWithSumHelper(arr, sum, index+1, subStack);

        subStack.remove(subStack.size() - 1);

        int right = findSubsequencesWithSumHelper(arr, sum, index+1, subStack);

        return left + right;
        
    }
    
    private static void findSubsequencesWithSum(int[] arr, int k) {
       
        List<Integer> currentList = new ArrayList<>();
        
        System.out.println("The count is " + findSubsequencesWithSumHelper(arr, k, 0, currentList));

    }
    

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        
        int k = 8;

        findSubsequencesWithSum(arr, k);
    }
   
}
