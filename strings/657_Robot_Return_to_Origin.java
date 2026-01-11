
/*
LeetCode 657: Robot Return to Origin

Approach:
- The robot starts at position (0, 0).
- Each move changes the position:
  - 'U' increases vertical position
  - 'D' decreases vertical position
  - 'L' decreases horizontal position
  - 'R' increases horizontal position
- Count vertical (U/D) and horizontal (L/R) moves.
- If both counts are zero at the end, the robot returns to origin.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;

        // Traverse each move
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);

            if (c == 'U') {
                vertical++;
            } else if (c == 'D') {
                vertical--;
            } else if (c == 'L') {
                horizontal--;
            } else { // 'R'
                horizontal++;
            }
        }

        // Robot returns to origin if both are zero
        return vertical == 0 && horizontal == 0;
    }
}
