package BinarySearch.LowerBound;

public class lowerBound {

    public static int lowerBoundValue(int[] arr, int lower, int n, int x) {

        int mid;
        int high = n - 1;

        int lowerValue = n;

        while(high >= lower) {

            mid = (high + lower) / 2;

            if(arr[mid] >= x) {
                lowerValue = mid;
                high = mid - 1;
            } else {
                lower = mid + 1;
            }

        }

        return lowerValue;
    
    }


    public static void main(String args[]) {

        int[] arr = {3 , 5, 8, 15, 19, 19, 19};
        int x = 9;

        System.out.println("Printing");
        System.out.println(lowerBoundValue(arr, 0, arr.length, x));
        System.out.println("Ended");
    }

}