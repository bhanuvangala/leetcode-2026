
// LeetCode 350 - Intersection of Two Arrays II
// Use HashMap to count frequency of elements in nums1
// Traverse nums2 and collect common elements based on frequency

import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // Store frequency of elements in nums1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Store intersection elements
        List<Integer> result = new ArrayList<>();

        // Check nums2 against the map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert list to array
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
