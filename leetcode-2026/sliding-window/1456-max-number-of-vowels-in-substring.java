class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        // build first window
        for(int right = 0; right < k; right++){
            char ch = s.charAt(right);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }

        int maxcount = count;

        // slide window
        for(int i = k; i < s.length(); i++){

            // add new character
            char add = s.charAt(i);
            if(add=='a'||add=='e'||add=='i'||add=='o'||add=='u'){
                count++;
            }

            // remove old character
            char remove = s.charAt(i-k);
            if(remove=='a'||remove=='e'||remove=='i'||remove=='o'||remove=='u'){
                count--;
            }

            maxcount = Math.max(maxcount, count);
        }

        return maxcount;
    }
}
