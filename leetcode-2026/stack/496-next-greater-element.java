/*Core Idea (Monotonic Stack)

We scan nums2 once using a monotonic decreasing stack.

For each element:

Pop smaller elements → their next greater element is found.

Store results in a HashMap for O(1) lookup.

Build the final answer for nums1 using the map. */

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stack to maintain a decreasing sequence
        Stack<Integer> stack = new Stack<>();

        // Map to store next greater element for each number in nums2
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse nums2 to find next greater elements
        for (int num : nums2) {

            // While current number is greater than stack top,
            // current number is the next greater element
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }

            // Push current number onto the stack
            stack.push(num);
        }

        // Remaining elements in stack have no next greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build result array for nums1 using the precomputed map
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
