package Recursion.CountGoodNumber;

public class index {

    public static long pow(int x, int n) {

        if(n == 0) return 1;

        long mod = 1000000007;

        long result = 0, temp = 0;

        if(n%2 == 0) {
            
            temp = pow(x, n/2);

            result = (temp * temp) % mod;

        } else {

            temp = pow(x, (n - 1)/2);

            result = (x * temp * temp) % mod;
            
        }

        return result;

    }


    public static int countGoodNumbers(int n) {

        int evenNumber = (int) (n / 2) + (int) (n % 2);

        int oddNumber = (int) (n / 2);

        long mod = 1000000007;

        return (int) ((pow(5, evenNumber) * pow(4, oddNumber)) % mod) ;
        
    }

    public static void main(String args[]) {
        System.out.println(countGoodNumbers(50));
    }
    
}
