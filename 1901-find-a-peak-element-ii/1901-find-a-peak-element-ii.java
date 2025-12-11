class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int start = 0;
        int end = mat[0].length - 1;
        while (start <= end) {
            int maxrow = 0, midcol = start + (end - start) / 2;

            for (int row = 0; row < mat.length; row++) {
                maxrow = mat[row][midcol] >= mat[maxrow][midcol] ? row : maxrow;
            }
            boolean leftisbig = midcol - 1 >= start && mat[maxrow][midcol - 1] > mat[maxrow][midcol];
            boolean rightisbig = midcol + 1 <= end && mat[maxrow][midcol + 1] > mat[maxrow][midcol];

            if (!leftisbig && !rightisbig)
                return new int[] { maxrow, midcol };

            else if (rightisbig)
                start = midcol + 1;
            else
                end = midcol - 1;
        }
        return null;
    }
}