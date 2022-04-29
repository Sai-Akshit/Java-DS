package binary_search;

public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start - (start - end)/2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                // element found
                return mid;
            }
        }

        // if element not found
        return -1;
    }
}
