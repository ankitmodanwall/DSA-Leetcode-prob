class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, 
         n = board[0].length;
        int[][] clone = new int[m][n];

        for(int i = 0; i<m; i++){
            for(int j= 0; j<n; j++){
                clone[i][j] = board[i][j];
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++)
            {
                int live = findLive(i,j,clone);

                if(clone[i][j] == 1){
                    if(live<2 || live >3){
                        board[i][j] =0;
                    }
                    else {
                        board[i][j] = 1;
                    }

                }else{
                    if(live ==3){
                        board[i][j] =1;
                    }
                }
            }
        }
    }
    private int findLive(int i, int j, int[][] board)
    {
        int [][] dirs = {
            {-1,-1}, {-1,0}, {-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}
        };
    int live = 0;
    for(int[] d : dirs){
        int x = i + d[0];
        int y = j + d[1];
        if(x >= 0 && x < board.length && y >=0 && y<board[0].length && board[x][y] ==1)live++;
    }
    return live;
    }

}