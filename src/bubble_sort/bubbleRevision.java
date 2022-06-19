package bubble_sort;
import java.util.Arrays;

public class bubbleRevision {
    public static void main(String[] args) {
        int[] numbers = {-10, 10, 1, 5};
        bubble(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    static void bubble (int[] arr) {
        boolean swapped;
        for (int i=0; i<arr.length; i++) { // here i is just a counter
            swapped = false;
            for (int j=1; j<arr.length - i; j++) {  // here j is for iterating through the elements of array
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
