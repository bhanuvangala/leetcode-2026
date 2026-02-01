class Solution {
    public int minimumCost(int[] nums) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min1){
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i]<min2){
                min2=nums[i];
            }
        }
        return nums[0]+min1+min2;
    }
}
/*Approach
Initialize a variable for the first cost with nums[0] and maintain two variables, min1 and min2, initialized to a very large value (here 100 because of given contraints nums[i]<=50).
Iterate through the rest of the array (from index 1 to n-1) to find the smallest and the second smallest values.
For every number x in the range nums[1...n-1]:
If x is smaller than min1, update min2 to be the old min1, and min1 to be x.
Else if x is smaller than min2, just update min2 to be x.
Return nums[0] + min1 + min2.
Complexity
Time complexity: O(N)
Space complexity: O(1) */