/*Instead of recalculating the sum every time:

Compute the total sum of the array.

Traverse from left to right.

For index i:

Subtract nums[i] from rightSum

Right count = n - i - 1

Check:

nums[i] * rightCount > rightSum


(Multiply instead of dividing → avoids floating point issues) */
class Solution {
    public int dominantIndexCount(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        // Step 1: calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int count = 0;
        int rightSum = totalSum;

        // Step 2: check dominance
        for (int i = 0; i < n - 1; i++) { // last index can't be dominant
            rightSum -= nums[i];
            int rightCount = n - i - 1;

            if (nums[i] * rightCount > rightSum) {
                count++;
            }
        }

        return count;
    }
}
