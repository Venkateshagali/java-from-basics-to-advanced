public class SlidingWindowMaxSumDemo {
    public static int maxSum(int[] arr, int k) {
        if (k > arr.length) {
            return -1;
        }
        int window = 0;
        for (int i = 0; i < k; i++) {
            window += arr[i];
        }

        int max = window;
        for (int i = k; i < arr.length; i++) {
            window += arr[i] - arr[i - k];
            if (window > max) {
                max = window;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSum(arr, 3));
    }
}
