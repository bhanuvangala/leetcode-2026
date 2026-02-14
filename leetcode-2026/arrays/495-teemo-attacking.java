class Solution {

    // Calculates total poisoned duration considering overlapping intervals
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int n = timeSeries.length;

        // If no attacks, no poison duration
        if (n == 0) {
            return 0;
        }

        int totalDuration = 0;

        // Iterate through each attack except the last
        for (int i = 0; i < n - 1; i++) {

            // Difference between consecutive attacks
            int gap = timeSeries[i + 1] - timeSeries[i];

            // Add the minimum between duration and gap
            // to handle overlap
            totalDuration += Math.min(duration, gap);
        }

        // Add full duration for the last attack
        totalDuration += duration;

        return totalDuration;
    }
}
