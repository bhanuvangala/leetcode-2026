/*
 LeetCode 27 - Remove Element

 Approach:
 - Use two pointers.
 - Traverse the array and copy elements that are not equal to val.
 - result stores the count of valid elements.

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
