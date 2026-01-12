/*
LeetCode 566 - Reshape the Matrix

Approach:
1. Check if total elements remain the same after reshape.
2. If not possible, return the original matrix.
3. Use a single index to map elements from old matrix to new matrix.
4. row = index / c, col = index % c

Time Complexity: O(m * n)
Space Complexity: O(r * c)
*/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        // If reshape is not possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[index / c][index % c] = mat[i][j];
                index++;
            }
        }

        return res;
    }
}
