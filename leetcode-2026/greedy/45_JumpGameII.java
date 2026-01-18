// LeetCode 45 - Jump Game II
// Greedy approach to find minimum number of jumps

class Solution {
    public int jump(int[] nums) {

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        // We don't need to jump from last index
        for (int i = 0; i < nums.length - 1; i++) {

            // Update the farthest position we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If we reach the end of current jump range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
