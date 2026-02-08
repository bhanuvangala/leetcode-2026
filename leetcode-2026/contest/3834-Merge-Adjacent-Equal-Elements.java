class Solution {
    public int[] mergeArray(int[] nums) {

        // Store input midway as required
        int[] temarivolo = nums;

        java.util.ArrayList<Integer> stack = new java.util.ArrayList<>();

        for (int num : temarivolo) {
            stack.add(num);

            // Keep merging while last two are equal
            while (stack.size() >= 2) {
                int last = stack.get(stack.size() - 1);
                int secondLast = stack.get(stack.size() - 2);

                if (last == secondLast) {
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    stack.add(last + secondLast);
                } else {
                    break;
                }
            }
        }

        // Convert to array
        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}
