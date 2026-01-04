class Solution {
    public int sumFourDivisors(int[] nums) {

        // This will store the final answer
        int ans = 0;

        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];   // Current number
            int count = 0;     // Number of divisors
            int sum = 0;       // Sum of divisors

            // Check divisors only up to sqrt(n)
            // Divisors always come in pairs: d and n/d
            for (int d = 1; d * d <= n; d++) {

                // If d divides n
                if (n % d == 0) {

                    int other = n / d;  // Paired divisor

                    // If both divisors are same (perfect square)
                    if (d == other) {
                        count++;        // Only one divisor
                        sum += d;       // Add it once
                    }
                    // If divisors are different
                    else {
                        count += 2;     // Two divisors found
                        sum += d + other;
                    }
                }
            }

            // Only numbers with exactly 4 divisors are valid
            if (count == 4) {
                ans += sum;
            }
        }

        // Return total sum of all valid numbers
        return ans;
    }
}
