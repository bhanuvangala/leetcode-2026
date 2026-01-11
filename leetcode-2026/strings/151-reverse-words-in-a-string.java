/*
LeetCode 151 - Reverse Words in a String (Java)

Approach:
1. Use trim() to remove leading and trailing spaces from the input string.
2. Split the string into words using split("\\s+"), which handles multiple spaces.
3. Use a StringBuilder to efficiently build the reversed string.
4. Loop from the last word to the second word, appending each word followed by a space.
5. Append the first word at the end (without an extra trailing space) and return the result.

Example:
Input:  "  hello   world  "
Trim:   "hello   world"
Split:  ["hello", "world"]
Reverse: "world hello"

Time Complexity: O(n) where n is the length of the string.
Space Complexity: O(n) for the split array and StringBuilder.
*/
class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = str.length - 1; i > 0; i--) {
            ans.append(str[i]).append(" "); 
        }
        return ans.append(str[0]).toString();
    }
}
