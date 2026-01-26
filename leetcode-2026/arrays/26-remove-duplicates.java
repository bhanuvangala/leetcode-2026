class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return -1;
        int index=1;
        // Traverse through the array and compare each element with the previous one
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1])
            nums[index++]=nums[i];
        }
        return index;
    }
}
/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */