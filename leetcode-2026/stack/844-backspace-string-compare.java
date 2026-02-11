/* Core Idea

Simulate typing in a text editor.

Use a stack:

Push normal characters

On #, remove the last character (if any)

Build the final string for both inputs.

Compare the results. */

import java.util.Stack;

class Solution {

    // Compare two strings after processing backspace operations
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    // Helper method to simulate typing with backspaces
    private String build(String str) {

        // Stack to simulate characters in the text editor
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char c : str.toCharArray()) {

            // If character is backspace, remove last character if exists
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            // Otherwise, add character to stack
            else {
                stack.push(c);
            }
        }

        // Build final processed string
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
