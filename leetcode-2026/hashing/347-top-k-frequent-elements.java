import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency of each number
        // map -> (number, how many times it appears)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store unique numbers in a list
        // map.keySet() contains all distinct elements
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort the list based on frequency (descending order)
        // If frequency of b > frequency of a, b comes before a
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Step 4: Take first k elements from the sorted list
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        // Step 5: Return result
        return res;
    }
}
