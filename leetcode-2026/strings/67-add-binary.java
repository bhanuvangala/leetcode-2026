class Solution {

    // Adds two binary strings and returns their sum as a binary string
    public String addBinary(String a, String b) {

        // Pointers starting from the last index of both strings
        int i = a.length() - 1;
        int j = b.length() - 1;

        // To store carry generated during addition
        int carry = 0;

        // StringBuilder to build the result in reverse order
        StringBuilder sb = new StringBuilder();

        // Continue while there are bits left or carry exists
        while (i >= 0 || j >= 0 || carry == 1) {

            // Start sum with carry from previous addition
            int sum = carry;

            // Add current bit from string a if available
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            // Add current bit from string b if available
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            // Append the current bit (sum modulo 2)
            sb.append(sum % 2);

            // Update carry for next iteration
            carry = sum / 2;
        }

        // Reverse because result was built from LSB to MSB
        return sb.reverse().toString();
    }
}
