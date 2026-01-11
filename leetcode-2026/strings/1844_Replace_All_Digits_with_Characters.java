/*
LeetCode 1844: Replace All Digits with Characters

Approach:
- The string follows a fixed pattern:
  - Even index -> lowercase letter
  - Odd index  -> digit
- For every digit at index i, replace it with:
    character at (i - 1) shifted forward by digit value

Example:
Input:  "a1c1e1"
Output: "abcdef"

Steps:
1. Convert the string into a character array for easy modification.
2. Traverse only odd indices (digits).
3. Convert digit character to integer using (char - '0').
4. Shift the previous character and replace the digit.
5. Convert the array back to a string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();

        // Traverse only odd indices where digits are present
        for (int i = 1; i < arr.length; i += 2) {
            int shift = arr[i] - '0';          // convert digit char to int
            arr[i] = (char)(arr[i - 1] + shift); // shift previous character
        }

        return new String(arr);
    }
}
