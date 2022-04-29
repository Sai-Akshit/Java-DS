package linear_search;

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                //returning the index of target element
                return i;
            }
        }

        // if the element is not found
        return -1;
    }
}
