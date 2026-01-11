import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Sort the array so that duplicate elements come next to each other
        Arrays.sort(nums);

        // Check adjacent elements for duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; // duplicate found
            }
        }

        // No duplicates found
        return false;
    }
}
