package Recursion.Subsequences.CombinationSum;

import java.util.*;

public class index {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ls = new ArrayList<>();
        cal(ls, target, 0, new ArrayList<>(), candidates);
        return ls;

    }

    public void cal(List<List<Integer>> res, int target, int index, List<Integer> state, int[] candidates) {
        
        if(index == candidates.length) {
            if(target == 0) {
                res.add(new ArrayList<>(state));
            }
            return;
        }

        if(candidates[index] <= target) {
            state.add(candidates[index]);
            cal(res, target - candidates[index] , index, state, candidates);
            state.remove(state.size() - 1);
        }

        cal(res, target, index + 1, state, candidates);

    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        index sol = new index();
        List<List<Integer>> ls = sol.combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    
}
