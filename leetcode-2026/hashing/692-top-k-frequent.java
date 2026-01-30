import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        // Step 1: Count frequency of each word
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Step 2: Store unique words
        List<String> list = new ArrayList<>(map.keySet());

        // Step 3: Sort by
        // 1) frequency descending
        // 2) lexicographical order ascending (if frequency same)
        Collections.sort(list, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);   // alphabetical order
            }
            return map.get(b) - map.get(a); // higher frequency first
        });

        // Step 4: Take top k elements
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(list.get(i));
        }

        return res;
    }
}
