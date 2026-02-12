/*Core Idea (Stack Pattern)

Traverse the string.

If current character equals the top of the stack → remove it (duplicate found).

Otherwise → push it.

Finally, rebuild the string from the stack.

This works because removing adjacent duplicates naturally follows LIFO behavior. */

import java.util.Stack;

class Solution {

    // Removes all adjacent duplicate characters in the string
    public String removeDuplicates(String s) {

        // Stack to store characters after processing
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {

            // If stack is not empty and top equals current character,
            // remove the duplicate
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } 
            // Otherwise, push current character onto stack
            else {
                stack.push(ch);
            }
        }

        // Build the final string from stack
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
