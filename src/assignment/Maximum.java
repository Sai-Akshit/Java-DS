package assignment;

public class Maximum {
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 3, 5, 9, 10, 12, 14};
        System.out.println(max(nums));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
