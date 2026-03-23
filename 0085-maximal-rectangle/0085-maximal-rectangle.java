class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = matrix[i][j] - '0';
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] += mat[i][j - 1];
                }
            }
        }
        int ans = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                int width = mat[i][j];
                if (width == 0)
                    continue;

                int currwid = width;
                for (int k = i; k < m && mat[k][j] > 0; k++) {
                    currwid = Math.min(currwid, mat[k][j]);
                    int heigth = k - i + 1;
                    ans = Math.max(ans, currwid * heigth);
                }

                currwid = width;
                for (int k = i; k >= 0 && mat[k][j] > 0; k--) {
                    currwid = Math.min(currwid, mat[k][j]);
                    int heigth = i - k + 1;
                    ans = Math.max(ans, currwid * heigth);
                }
            }
        }
        return ans;
    }
}