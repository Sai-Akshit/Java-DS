package revision;

public class Searching {
    static int linearsearch(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        // if element is not found
        return -1;
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= mid) {
            int mid = end - (end - start)/2;
        }

        // if element is not found
        return -1;
    }

}
