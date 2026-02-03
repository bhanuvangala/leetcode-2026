class Solution {

    // LeetCode 209: Minimum Size Subarray Sum
    // Pattern: Sliding Window (Variable Size)
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int minSubArrayLen(int target, int[] nums) {

        // Left pointer of the sliding window
        int left = 0;

        // Stores the sum of the current window
        int sum = 0;

        // Stores the minimum length of a valid subarray found so far
        int minLen = Integer.MAX_VALUE;

        // Right pointer expands the window
        for (int right = 0; right < nums.length; right++) {

            // Add current element to the window
            sum += nums[right];

            // Shrink the window while the sum is valid (>= target)
            while (sum >= target) {

                // Update minimum length using current window size
                minLen = Math.min(minLen, right - left + 1);

                // Remove the leftmost element from the window
                sum -= nums[left];

                // Move left pointer to shrink the window
                left++;
            }
        }

        // If no valid subarray was found, return 0
        // Otherwise, return the minimum length
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
