/*
LeetCode 1207: Unique Number of Occurrences

Approach:
- Use a HashMap to count the frequency of each number in the array.
- Then use a HashSet to check if all frequencies are unique.
- If any frequency repeats, return false.
- Otherwise, return true.

Steps:
1. Traverse the array and store frequency of each number in a HashMap.
2. Traverse the map values and add them to a HashSet.
3. If a frequency already exists in the set, return false.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        // Check if frequencies are unique
        for (int freq : map.values()) {
            if (!set.add(freq)) {
                return false; // duplicate frequency found
            }
        }

        return true;
    }
}
