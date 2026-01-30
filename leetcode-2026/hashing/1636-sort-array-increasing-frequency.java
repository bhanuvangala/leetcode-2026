import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        // Step 1: Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store unique numbers
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort
        // 1) frequency ascending
        // 2) value descending if frequency same
        Collections.sort(list, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return b - a;        // value descending
            }
            return map.get(a) - map.get(b); // frequency ascending
        });

        // Step 4: Build result array
        int[] res = new int[nums.length];
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            int freq = map.get(num);

            // place number 'freq' times
            for (int j = 0; j < freq; j++) {
                res[index++] = num;
            }
        }

        return res;
    }
}
