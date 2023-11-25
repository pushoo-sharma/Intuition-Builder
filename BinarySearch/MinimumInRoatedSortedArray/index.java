package BinarySearch.MinimumInRoatedSortedArray;

public class index {
    
    private static int findMin(int[] arr) {
        
        int low = 0, high = arr.length - 1;
        int mid = ( low + high ) / 2;
        int lowSearch = Integer.MAX_VALUE;
        int lowIndex = 0;

        while(low <= high) {

            mid = ( low + high ) / 2;
            
            if(arr[low] < arr[mid]) {
                if(lowSearch > arr[low]) {
                    lowSearch = arr[low];
                    lowIndex = low;
                }
                low = mid + 1;
            } else {
                if(lowSearch > arr[mid+1]) {
                    lowSearch = arr[mid+1];
                    lowIndex = mid + 1;
                }
                high = mid - 1;
            }
 
        }

        return lowIndex;

    }

    public static void main(String args[]) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans );
    }

}
