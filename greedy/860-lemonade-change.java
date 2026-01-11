/*
LeetCode 860 - Lemonade Change

Approach (Greedy):
- Each lemonade costs $5
- Track the number of $5 and $10 bills
- For a $5 bill: just collect it
- For a $10 bill: give back one $5
- For a $20 bill:
    - Prefer giving one $10 + one $5 (to save $5 bills)
    - Otherwise, give three $5 bills
- If change cannot be given at any point, return false

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivecnt = 0, tencnt = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fivecnt++;
            } else if (bills[i] == 10) {
                if (fivecnt > 0) {
                    fivecnt--;
                    tencnt++;
                } else {
                    return false;
                }
            } else { // bill == 20
                if (fivecnt > 0 && tencnt > 0) {
                    fivecnt--;
                    tencnt--;
                } else if (fivecnt >= 3) {
                    fivecnt -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
