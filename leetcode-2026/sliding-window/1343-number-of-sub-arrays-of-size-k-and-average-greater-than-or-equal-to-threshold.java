class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;   // number of valid subarrays
        int sum = 0;     // sum of current window

        // build the first window of size k
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // check the first window
        if (sum >= threshold * k) {
            count++;
        }

        // slide the window
        for (int i = k; i < arr.length; i++) {

            // remove element going out of window and add new element
            sum = sum - arr[i - k] + arr[i];

            // check current window
            if (sum >= threshold * k) {
                count++;
            }
        }

        return count;
    }
}
