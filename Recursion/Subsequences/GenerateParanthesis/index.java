package Recursion.Subsequences.GenerateParanthesis;

import java.util.ArrayList;
import java.util.List;

public class index {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, "", 0, 0, result);
        return result;
    }

    private static void generate(int n, String current, int open, int close, List<String> result) {
        if (open == n && close == n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(n, current + "(", open + 1, close, result);
        }

        if (close < open) {
            generate(n, current + ")", open, close + 1, result);
        }
    }

    public static void main(String[] args) {
        int n1 = 3;
        List<String> result1 = generateParenthesis(n1);
        System.out.println("Output for n = " + n1 + ": " + result1);

        int n2 = 1;
        List<String> result2 = generateParenthesis(n2);
        System.out.println("Output for n = " + n2 + ": " + result2);
    }
    
}



(