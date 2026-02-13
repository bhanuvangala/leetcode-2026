/*Core Idea (Modified Binary Search)

We need:

First occurrence of target

Last occurrence of target

Instead of stopping when we find the target:

For first occurrence → continue searching on the left

For last occurrence → continue searching on the right

This keeps time complexity O(log n). */
class Solution {

    // Returns starting and ending position of target in sorted array
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    // Binary search to find first occurrence of target
    private int findFirst(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;          // store answer
                high = mid - 1;     // move left to find earlier occurrence
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Binary search to find last occurrence of target
    private int findLast(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;          // store answer
                low = mid + 1;      // move right to find later occurrence
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
