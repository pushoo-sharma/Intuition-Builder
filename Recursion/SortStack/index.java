package Recursion.SortStack;

import java.util.Arrays;
import java.util.Stack;

public class index {

    public static Stack<Integer> sortStack(Stack<Integer> st, int temp) {

        if(st.isEmpty() || st.peek() > temp) {
            st.add(temp);
            return st;
        }

        int popEle = st.pop();

        sortStack(st, temp);

        st.add(popEle);

        return st;

    }
    
    public static Stack<Integer> sortStack(Stack<Integer> st) {

        if(st.isEmpty()) {
            return st;
        }

        int temp = st.pop();

        sortStack(st);

        sortStack(st, temp);

        return st;

    }

    public static void main(String args[]) {
        
        Stack<Integer> st = new Stack<>();

        st.addAll(Arrays.asList(3, 1, 4, 2, 5));

        sortStack(st);

        for( int i : st) {
            System.out.println(i);
        }

    }

}
