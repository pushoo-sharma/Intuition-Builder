package String.RotateString;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    
    public static void main(String args[]) {

        String s = "abcde", goal = "cdeab";

        if(s.length() != goal.length()) System.out.println("Not");

        Queue<Character> queStr = new LinkedList<>();

        for(Character c: s.toCharArray()) {
            queStr.offer(c);
        }
        
        int length_of_queue = s.toCharArray().length;

        while(length_of_queue >= 0) {

            StringBuilder str = new StringBuilder();

            for(Character c : queStr) {
                str.append(c);
            }

            if(str.toString().equals(goal)) {
                System.out.println("yes");
                break;
            }

            Character popEle = queStr.poll();
            queStr.add(popEle);
            length_of_queue--;
        }

        System.out.println("No");

    }

}
