package BinarySearch.SearchInSortedArrayTwo;

public class index {

    public static boolean searchInARotatedSortedArrayII(int[] arr, int k) {

        int start = 0, last = arr.length - 1, search = k;

        int mid = ( start + last ) / 2;

        while(start < last) {

            mid = ( start + last ) / 2;
            
            if(arr[mid] == search) return true;

            if(arr[start] == arr[mid] && arr[mid] == arr[last]) {
               start++;
               last--;
               continue;
            } 

            // first half sorted
            if(arr[start] < arr[mid]) {
                
                if(arr[start] <= search && search <= arr[mid]) {
                    last = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if(arr[mid] <= search && search <= arr[last]) {
                    start = mid + 1;
                } else {
                    last = mid - 1;
                }

            }

        }

        return false;

    }   

    public static void main(String args[]) {

        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 1;
        boolean ans = searchInARotatedSortedArrayII(arr, k);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");

    }

}
