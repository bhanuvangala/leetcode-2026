/**
 * https://leetcode.com/problems/move-zeroes/
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[index++]=0;
        }
        
    }
}