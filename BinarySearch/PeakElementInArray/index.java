package BinarySearch.PeakElementInArray;

import java.util.ArrayList;
import java.util.Arrays;

public class index {

    public static int findPeakElement(ArrayList<Integer> arr){
        
        int low = 0, end = arr.size() - 1;
        int mid = 0;

        while(low <= end) {

            mid = ( low + end ) / 2;
            
            if((arr.get(mid - 1) < arr.get(mid)) && (arr.get(mid) > arr.get(mid + 1))) {
                return mid;
            } 

            if(arr.get(mid - 1) < arr.get(mid)) {
                low = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
        int ans = findPeakElement(arr);
        System.out.println("The peak is at index: " + ans);
    }

}
