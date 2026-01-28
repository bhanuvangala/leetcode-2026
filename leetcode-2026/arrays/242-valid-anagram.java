/*Idea:
Two strings are anagrams if they contain the same characters in the same frequency.

Steps:

Convert both strings into character arrays.

Sort both character arrays.

Compare the sorted arrays.

If they are equal, the strings are anagrams → return true.

Otherwise → return false.

Why it works:
Sorting rearranges characters alphabetically.
If two strings are anagrams, their sorted forms will be identical.

Time Complexity: O(n log n)
Space Complexity: O(n)*/

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
}
