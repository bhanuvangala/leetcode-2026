class Solution {

    // This method calculates the score as:
    // (number of vowels) / (number of consonants)
    public int vowelConsonantScore(String s) {

        // vcnt → counts vowels
        // ccnt → counts consonants
        int vcnt = 0;
        int ccnt = 0;

        // Traverse each character in the string
        for (int i = 0; i < s.length(); i++) {

            // Convert character to lowercase to handle both upper & lower case
            char ch = Character.toLowerCase(s.charAt(i));

            // Consider only alphabetic characters (ignore digits/symbols)
            if (ch >= 'a' && ch <= 'z') {

                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vcnt++; // increment vowel count
                } else {
                    ccnt++; // otherwise, it is a consonant
                }
            }
        }

        // If there are no consonants, avoid division by zero
        // Return 0 as per problem requirement
        return ccnt == 0 ? 0 : vcnt / ccnt;
    }
}
