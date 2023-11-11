package BinarySearch.UpperBound;

public class upperBound {

    public static int upperBoundValue(int[] arr, int lower, int n, int x) {

        int mid;
        int high = n - 1;

        int lowerValue = n;

        while(high >= lower) {

            mid = (high + lower) / 2;

            if(arr[mid] > x) {
                lowerValue = mid;
                high = mid - 1;
            } else {
                lower = mid + 1;
            }

        }

        return lowerValue;
    
    }


    public static void main(String args[]) {

        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;

        System.out.println("Printing");
        System.out.println(upperBoundValue(arr, 0, arr.length, x));
        System.out.println("Ended");
    }


    
}

