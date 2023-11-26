package BinarySearch.SingleElementInSortedArray;

import java.util.ArrayList;
import java.util.Arrays;

public class index {

    public static int singleNonDuplicate(ArrayList<Integer> arr) {

        int start = 0, end = arr.size() - 1;
        int mid = ( start + end ) / 2;

        while(start <= end) {

            mid = ( start + end ) / 2;

            // base condition
            if(!arr.get(mid).equals(arr.get(mid - 1)) && !arr.get(mid).equals(arr.get(mid + 1))) {
                return mid;
            }

            if(mid % 2 == 1) {

                if(arr.get(mid).equals(arr.get(mid - 1))) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {

                if(arr.get(mid).equals(arr.get(mid + 1))) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

            

        }

        return  -1;

    }

    public static void main(String args[]) {
        
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int ans = singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);

    }

}
