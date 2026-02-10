/* Core Idea (Monotonic Increasing Stack)

Maintain a stack of indices with increasing bar heights

When a smaller height appears:

Pop bars and calculate area where the popped bar is the minimum height

Add a sentinel (0 height) at the end to flush remaining bars */

import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {

        // Stack to store indices of histogram bars
        // Maintains increasing heights
        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;

        // Iterate through all bars (+ one extra iteration with height 0)
        for (int i = 0; i <= heights.length; i++) {

            // Use 0 height at the end to process remaining bars in stack
            int currHeight = (i == heights.length) ? 0 : heights[i];

            // Calculate area while current height is smaller
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {

                // Height of the bar forming the rectangle
                int height = heights[stack.pop()];

                // Right boundary is current index
                int right = i;

                // Left boundary is index after previous smaller element
                int left = stack.isEmpty() ? -1 : stack.peek();

                // Width between left and right boundaries
                int width = right - left - 1;

                // Update maximum area
                maxArea = Math.max(maxArea, height * width);
            }

            // Push current index into stack
            stack.push(i);
        }

        return maxArea;
    }
}
