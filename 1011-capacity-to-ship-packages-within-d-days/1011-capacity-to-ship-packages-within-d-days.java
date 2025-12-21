class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincap =0;
        int maxcap = 0;
        for(int weight : weights){
            mincap = Math.max(mincap,weight);
            maxcap += weight;
        }

            //b-search

            while(mincap<maxcap)
            {
                int mid = mincap + (maxcap-mincap)/2;
                int day = 1;
                int sum = 0;
                for(int weight : weights){
                    if(sum + weight>mid){
                        day++;
                        sum = 0;
                    }
                    sum += weight;
                }
                //if more days are req
                if(day>days){
                    mincap = mid+1;
                }
                    else 
                    maxcap = mid;
            }
            return mincap;
    }
}