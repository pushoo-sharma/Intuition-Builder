package BinarySearch.SearchInsertPosition;

public class index {
    
    public static int binarySearchInsert(int[] arr, int value, int low, int high, int markIndex) {
        
        int mid =  ( low + high ) / 2;

        if(low > high) return markIndex;

        if(arr[mid] <= value) {
            return binarySearchInsert(arr, value, mid + 1, high, markIndex);
        } else {
            markIndex = mid;
            return binarySearchInsert(arr, value, low, mid - 1, markIndex);
        }

    }

    public static void main(String args[]) {

        int[] arr = {1,2,4,7};
        int value = 6;
        System.out.println(binarySearchInsert(arr, value, 0, arr.length - 1, arr.length));

    }

}
