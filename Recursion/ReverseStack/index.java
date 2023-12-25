package Recursion.ReverseStack;

import java.util.Arrays;
import java.util.Stack;

public class index {

    public static Stack<Integer> insertAtBottom(Stack<Integer> st, Integer temp) {

        if(st.isEmpty()) {
            st.push(temp);
            return st;
        } else {
            int el = st.pop();
            insertAtBottom(st, temp);
            st.push(el);
        }

        return st;

    }



    public static Stack<Integer> reverseStack(Stack<Integer> st) {

        if(st.isEmpty()) {
            return st;
        }

        int temp = st.pop();

        reverseStack(st);

        insertAtBottom(st, temp);

        return st;

    }
    

    public static void main(String args[]) {

        Stack<Integer> st = new Stack<>();
        
        st.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original Stack: " + st);

        st = reverseStack(st);

        System.out.println("Reversed Stack: " + st);

    }

}
