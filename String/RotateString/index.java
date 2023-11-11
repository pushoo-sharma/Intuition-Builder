package String.RotateString;

public class index {
    public static void main(String args[]) {
       
        String s = "abcde", goal = "cdeab";

        if(s.length() != goal.length()) System.out.println("Not");

        s = s + s;

        if(s.contains(goal)) System.out.println("yes");
        else System.out.println("no");

    }

}
