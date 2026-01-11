/*
LeetCode 977: Squares of a Sorted Array

Approach:
- The input array is already sorted but may contain negative numbers.
- Squaring the numbers can break the sorted order.
- Steps:
  1. Create a new array to store squares of each element.
  2. Square every element from the original array.
  3. Sort the squared array using Arrays.sort().
  4. Return the sorted squared array.

Time Complexity: O(n log n) due to sorting
Space Complexity: O(n)
*/

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        // Square each element
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }

        // Sort the squared values
        Arrays.sort(res);

        return res;
    }
}
