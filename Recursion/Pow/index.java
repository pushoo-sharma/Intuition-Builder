package Recursion.Pow;

public class index {
    
    public static double myPow(double x, int n) {

       if(n == 0) return 1;

       boolean isNegative = false;

       if(n<0) {
        isNegative = true;
        n = Math.abs(n);
       }

       double result;

       if(n%2 == 0) {
        double res = myPow(x, n / 2);
        result = res * res;
       } else {
        double res = myPow(x, (n - 1)/ 2);
        result = x * res * res;
       }

       return isNegative ? 1 / result: result;

    }

    public static void main(String args[]) {
        int x = 2, n = -2;
        System.out.println(myPow(x, n));
    }

}
