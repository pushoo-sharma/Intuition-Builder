package BinarySearch.FirstAndLastOccurenceSorted;

public class index {
    
    public static int findFirstNumber(int[] arr, int target) {

        int low = 0, high = arr.length;
        int mid = (high - low) / 2;
        int checkHigh = high;

        while(low < high) {

            mid = (high + low) / 2;

            if(arr[mid] == target) {
                high = mid - 1;
                checkHigh = mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return checkHigh;

    }

    public static int findLastNumber(int[] arr, int target) {

        int low = 0, high = arr.length;
        int mid = (high - low) / 2;
        int checkHigh = high;

        while(low <= high) {

            mid = (high + low) / 2;

            if(arr[mid] == target) {
                low = mid + 1;
                checkHigh = mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return checkHigh;

    }

    public static void main(String args[]) {
        
        int[] findNum = {3,4,13,13,13, 13,20,40};
        int target = 13;
        System.out.println(findLastNumber(findNum, target));

    }

}
