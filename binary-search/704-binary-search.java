/*
LeetCode 704 – Binary Search

Problem:
Given a sorted array of integers nums and a target value,
return the index if the target is found. Otherwise, return -1.

Approach (Iterative Binary Search):
- Initialize two pointers: low and high.
- Repeatedly narrow the search space by comparing mid element with target.
- If mid equals target, return index.
- If mid is less than target, search right half.
- Else, search left half.

Dry Run:
nums = [-1,0,3,5,9,12], target = 9
low=0, high=5 → mid=2 (3 < 9)
low=3, high=5 → mid=4 → found

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
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
        return -1;
    }
}
