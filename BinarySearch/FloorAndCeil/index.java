package BinarySearch.FloorAndCeil;

public class index {

    public static int floorValue(int[] arr, int low, int high, int search) {
        
        int mid = 0;

        int valueLower = arr[high];
        
        while(low <= high) {

            mid = (low + high) / 2;

            if(arr[mid] >= search) {
                high = mid - 1;
                valueLower = arr[mid];
            } else {
                low = mid + 1;
            }

        }
        
        return valueLower;

    }

    public static int ceilValue(int[] arr, int low, int high, int search) {
        
        int mid = 0;

        int valueLower = arr[high];
        
        while(low <= high) {

            mid = (low + high) / 2;

            if(arr[mid] <= search) {
                low = mid + 1;
                valueLower = arr[mid];
            } else {
                high = mid - 1;
            }

        }
        
        return valueLower;

    }
    

    public static void main(String args[]) {
        
        int arr[] = {3, 4, 4, 5, 7, 8, 10};
        
        System.out.println("Floor" + floorValue(arr, 0, arr.length - 1, 5));

        System.out.println("Ceil" + ceilValue(arr, 0, arr.length - 1, 5));

    }

}
