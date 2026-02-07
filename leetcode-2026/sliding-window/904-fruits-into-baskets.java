import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {

        // HashMap to store fruit type and its count in current window
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;      // left pointer of sliding window
        int maxLen = 0;    // stores maximum window size

        // right pointer expands the window
        for (int right = 0; right < fruits.length; right++) {

            // add current fruit to the window
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // if window becomes invalid (more than 2 fruit types)
            // shrink window from the left
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);

                // remove fruit type if its count becomes zero
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++; // move left pointer
            }

            // update maximum valid window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
