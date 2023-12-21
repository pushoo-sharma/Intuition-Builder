package Recursion.StrongHold;

public class index {

    public static int myAtoi(String s) {

        s = s.trim();

        if(s.isEmpty()) {
            return 0;
        }

        boolean isNegative = s.charAt(0) == '-' ? true : false;

        if(isNegative) {
            s = s.substring(1);
        } 

        int lenght = s.length() - 1;

        int result = myAtoi(s.substring(0, lenght)) * 10 + (s.charAt(lenght) - '0');

        return isNegative ?  ( - result ) : result;

    }
    

    public static void main(String args[]) {
        String s = "   -42";    
        System.out.println(myAtoi(s));
    }

}
