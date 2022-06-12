package bubble_sort;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i=0; i<arr.length; i++) {
            swapped = false;
            // for each step max element will come at last respective index
            for (int j=1; j<arr.length - i; j++) {
                // swap if the item is smaller than previous item
                if (arr[j] < arr[j-1]) {
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if the element did not swap for a particular step then we got our final sorted array
            if (!swapped) { // !false = true
                break;
            }
        }
    }
}
