/*
LeetCode 961 – N-Repeated Element in Size 2N Array

Problem:
An array of size 2N contains N+1 unique elements.
One element is repeated exactly N times.
Return the element repeated N times.

Approach (Observation Based – O(1) Space):
- The repeated element must appear at distance ≤ 2.
- Traverse the array and check:
  - nums[i] == nums[i+1] OR
  - nums[i] == nums[i+2]
- If found, return nums[i].
- Otherwise, the repeated element is the last element.

Dry Run:
nums = [5,1,5,2,5,3,5]
i=0 → nums[0] == nums[2] → return 5

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
