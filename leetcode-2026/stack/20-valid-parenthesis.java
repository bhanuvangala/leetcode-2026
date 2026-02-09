import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Stack to store opening brackets
        Stack<Character> st = new Stack<>();

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {

            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            // If it's a closing bracket
            else {
                // If stack is empty, no matching opening bracket
                if (st.isEmpty()) {
                    return false;
                }

                // Pop the last opening bracket
                char top = st.pop();

                // Check for matching pair
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        // If stack is empty, all brackets matched correctly
        return st.isEmpty();
    }
}
