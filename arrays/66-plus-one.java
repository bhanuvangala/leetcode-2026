/*
LeetCode 66 – Plus One

Problem:
Given a non-negative integer represented as an array of digits, increment the number by one.

Approach:
- Traverse from the last digit.
- If digit < 9, increment and return.
- If digit == 9, make it 0 and continue.
- If all digits are 9, create a new array with leading 1.

Dry Run:
digits = [9,9]
→ [1,0,0]

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
