/* Core Idea (Stack Simulation)

Use a stack to keep track of valid round scores

Each operation modifies the stack:

"C" → remove last score

"D" → double last score

"+" → sum of last two scores

number → push as a score

Final answer = sum of all values in the stack */
import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {

        // Stack to store valid round scores
        Stack<Integer> stack = new Stack<>();

        // Process each operation
        for (String op : operations) {

            // Remove the last valid score
            if (op.equals("C")) {
                stack.pop();
            }
            // Double the last valid score
            else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            }
            // Add the last two valid scores
            else if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();

                // Restore the popped value
                stack.push(last);

                // Push the sum
                stack.push(last + secondLast);
            }
            // Push numeric score
            else {
                int val = Integer.parseInt(op);
                stack.push(val);
            }
        }

        // Calculate total score
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}