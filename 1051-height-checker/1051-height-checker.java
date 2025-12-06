class Solution {
    public int heightChecker(int[] heights) {
 
        int[] exp = heights.clone();
        Arrays.sort(exp);
        int cnt = 0;
        for(int i = 0; i<heights.length; i++){
            if(heights[i] != exp[i])
            cnt++;
        }
        return cnt;
 
 


    }
}