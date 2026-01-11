/*
LeetCode 33 – Search in Rotated Sorted Array

Problem:
An integer array nums is sorted in ascending order and then rotated.
Given a target value, return its index if found, otherwise return -1.

Approach (Modified Binary Search):
- Use binary search.
- At each step, determine which half is sorted.
- If left half is sorted:
  - Check if target lies in left half.
- Else right half is sorted:
  - Check if target lies in right half.
- Adjust low and high accordingly.

Dry Run:
nums = [4,5,6,7,0,1,2], target = 0
mid = 3 → left half sorted
target not in left → search right
→ found at index 4

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
