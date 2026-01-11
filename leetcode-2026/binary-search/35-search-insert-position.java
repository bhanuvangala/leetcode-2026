/*
LeetCode 35 – Search Insert Position

Problem:
Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not, return the index where it would be inserted in order.

Approach (Binary Search):
- Perform standard binary search.
- If target is found, return its index.
- If not found, the low pointer indicates the correct insert position.

Dry Run:
nums = [1,3,5,6], target = 2
low=0, high=3
mid=1 → nums[mid]=3 > 2 → high=0
mid=0 → nums[mid]=1 < 2 → low=1
loop ends → return low = 1

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}
