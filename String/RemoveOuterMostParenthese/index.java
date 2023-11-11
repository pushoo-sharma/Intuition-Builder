package String.RemoveOuterMostParenthese;

public class index {
    public static void main(String args[]) {

        String s = "(()())(())(()(()))";
        char[] arr = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '(') {
                if(openCount > 0) {
                    result.append(arr[i]);
                }
                openCount++;
            } else {
                if(openCount > 1) {
                    result.append(arr[i]);
                }
                openCount--;
            }
        }

        System.out.println("-----" + result.toString());

    }

}
