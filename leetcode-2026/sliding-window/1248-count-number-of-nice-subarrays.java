/**
 * LeetCode 1248 - Count Number of Nice Subarrays
 *
 * Problem:
 * Count the number of contiguous subarrays that contain exactly k odd numbers.
 *
 * Approach (Sliding Window):
 * It is difficult to directly count subarrays with exactly k odd numbers.
 * Instead, we use the formula:
 *
 *     exactlyK = atMost(k) - atMost(k - 1)
 *
 * Where:
 * - atMost(k)   -> number of subarrays containing at most k odd numbers
 * - atMost(k-1) -> number of subarrays containing at most k-1 odd numbers
 *
 * Subtracting them gives only subarrays with exactly k odd numbers.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    /**
     * Helper function to count subarrays with at most k odd numbers
     */
    private int atMost(int[] nums, int k) {
        int left = 0;   // start of sliding window
        int odd = 0;    // count of odd numbers in current window
        int count = 0;  // total valid subarrays

        // expand window using right pointer
        for (int right = 0; right < nums.length; right++) {

            // if current number is odd, increase odd count
            if (nums[right] % 2 != 0) {
                odd++;
            }

            // shrink window until odd count is valid
            while (odd > k) {
                if (nums[left] % 2 != 0) {
                    odd--;
                }
                left++;
            }

            // number of valid subarrays ending at index right
            count += (right - left + 1);
        }

        return count;
    }
}
