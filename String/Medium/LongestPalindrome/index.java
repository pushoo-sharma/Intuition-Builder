package String.Medium.LongestPalindrome;


public class index {

    public static String longestPalindrome(String s) {
        
        String str = new StringBuilder(s).reverse().toString();

        int[][] dp = new int[s.length() + 1][s.length() + 1];

        int endPoint = 0;

        int maxLength = 0;

        for(int i = 1; i <= str.length(); i++) {
            for(int j = 1; j <= str.length(); j++) {
                if(str.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endPoint = i;
                    }
                }
            }
        }

        return str.substring(endPoint - maxLength, endPoint);
    }

    public static void main(String[] args) {

        // Example usage:
        String s1 = "babad";
        System.out.println(longestPalindrome(s1));  // Output: "bab" or "aba"

    }

}