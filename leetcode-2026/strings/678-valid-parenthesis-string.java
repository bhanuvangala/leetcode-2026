/*
LeetCode 678 - Valid Parenthesis String

Approach (Greedy):
- Use two counters:
  minOpen → minimum possible number of open '('
  maxOpen → maximum possible number of open '('
- '(' increases both minOpen and maxOpen
- ')' decreases both minOpen and maxOpen
- '*' can act as '(', ')' or empty:
    - decrease minOpen
    - increase maxOpen
- If maxOpen becomes negative at any point, the string is invalid
- Clamp minOpen to 0 because open count cannot be negative
- At the end, if minOpen == 0, the string is valid

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { // '*'
                minOpen--;
                maxOpen++;
            }

            if (maxOpen < 0) return false;
            if (minOpen < 0) minOpen = 0;
        }

        return minOpen == 0;
    }
}
