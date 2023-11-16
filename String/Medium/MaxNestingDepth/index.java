package String.Medium.MaxNestingDepth;

public class index {
    public static void main(String args[]) {
        
        String s = "(1+(2*3)+((8)/4))+1";

        int openBracket = 0, maxCount = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                openBracket++;
                maxCount = Math.max(maxCount, openBracket);
            } else if (s.charAt(i) == ')') {
                openBracket--;
            }
        }

        System.out.println(maxCount);
    }

}
