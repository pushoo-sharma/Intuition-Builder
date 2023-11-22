package String.Medium.ReverseEveryString;

import java.util.Stack;

public class index {
    
    public static String reverseWords(String s) {
        
        String[] newStr = s.split(" ");

        Stack<String> stackStr = new Stack<>();

        for(String a : newStr) {
            stackStr.add(a);
        }

        StringBuilder stBuild = new StringBuilder();

        while(!stackStr.isEmpty()) {
            stBuild.append(stackStr.pop());
            if(!stackStr.isEmpty()) {
                stBuild.append(" ");
            }
        }

        return stBuild.toString();

    }

    public static void main(String args[]) {
        
        String str = "the sky is blue";
        System.out.println(reverseWords(str));

    }
}
