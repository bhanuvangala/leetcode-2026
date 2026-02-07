class Solution {
    public int countGoodSubstrings(String s) {

        int count = 0;

        // iterate till i+2 is within string length
        for (int i = 0; i + 2 < s.length(); i++) {

            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            // check if all three characters are distinct
            if (a != b && b != c && a != c) {
                count++;
            }
        }

        return count;
    }
}
