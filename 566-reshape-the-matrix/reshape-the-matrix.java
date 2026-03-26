class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            // Map 1D index to 2D
            res[i / c][i % c] = mat[i / n][i % n];
        }

        return res;
    }
}