/*
Approach:
- Use a counter to track depth of parentheses
- Skip the first '(' and last ')' of each primitive string
- Append characters only when depth > 0
Time Complexity: O(n)
Space Complexity: O(n)
*/
// LeetCode 1021 - Remove Outermost Parentheses
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (cnt > 0) {
                    result.append(ch);
                }
                cnt++;
            } else {
                cnt--;
                if (cnt > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}
