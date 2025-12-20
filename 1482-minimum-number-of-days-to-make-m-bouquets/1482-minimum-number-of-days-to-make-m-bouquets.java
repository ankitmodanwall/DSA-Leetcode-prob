class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int start = 1;
        int end = (int) 1e9;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isPossible( bloomDay,m,k,mid)) {
                end = mid;
               
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean isPossible(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flower = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <=day){
            flower++;
      if(flower == k){
        bouquets++;
        flower=0;
      }
      }else{
        flower = 0;
      }
                  
            if (bouquets>=m){
                return true;
         
            }
        }
        return false;
    }
}
