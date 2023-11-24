package BinarySearch.SearchInSortedArrayOne;

import java.util.ArrayList;
import java.util.Arrays;

public class index {

    public static int search(ArrayList<Integer> arr, int size, int search) {

        int start = 0, last = size;
        
        int mid = ( start + last ) / 2;

        while(start <= last) {

            mid = ( start + last ) / 2;
            
            if(arr.get(mid) == search) {
                return mid;
            } 
            
            // first half sorted
            if(arr.get(start) <= arr.get(mid)) {
                
                if(arr.get(start) <= search && search <= arr.get(mid)) {
                    last = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if(arr.get(mid) <= search && search <= arr.get(last)) {
                    start = mid + 1;
                } else {
                    last = mid - 1;
                }

            }

        }

        return -1;

    }
    
    public static void main(String args[]) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int n = 9, k = 1;
        int ans = search(arr, n, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);

    }

}
