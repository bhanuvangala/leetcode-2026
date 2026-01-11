/*
 LeetCode 55 – Jump Game

 Approach: Greedy (Right to Left)

 Idea:
 We try to check if we can reach the last index starting from index 0.

 1. Start from the last index and store it as the target position.
 2. Traverse the array from right to left.
 3. At each index i, check:
        if i + nums[i] >= target
    - If true, it means we can jump from index i to the target.
    - So update the target to i.
 4. After the loop:
    - If the target becomes 0, then we can reach the end from the start.

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length - 1;

        for (int i = n; i >= 0; i--) {
            if (i + nums[i] >= n) {
                n = i;
            }
        }

        return n == 0;
    }
}
