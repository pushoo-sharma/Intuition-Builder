package BinarySearch.lastOccurenceSortedArray;

public class index {

    public static int floorValue(int[] arr, int low, int high, int search) {
        
        int mid = 0;

        int valueLower = 0;
        
        while(low <= high) {

            mid = (low + high) / 2;

            if(arr[mid] == search) {
                low = mid + 1;
                valueLower = mid;
            } else if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        
        return valueLower;
    }

    public static int firstOccurence(int[] arr, int low, int high, int search) {
        
        int mid = 0;

        int valueLower = 0;
        
        while(low <= high) {

            mid = (low + high) / 2;

            if(arr[mid] == search) {
                high = mid - 1;
                valueLower = mid;
            } else if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        
        return valueLower;
    }
    

    public static void main(String args[]) {
        int array[] = {3,4,13,13,13, 13, 20,40};
        // System.out.println(floorValue(array, 0, array.length - 1, 13));
        System.out.println(firstOccurence(array, 0, array.length - 1, 13));
    }

}


