class Solution {
    public boolean canfit(int[] nums,int perK, int k){
        int cnt =1;
        int sum = 0;
        for(int num : nums){
            if(sum+num>perK){
                cnt++;
                sum = num;
            }
            else{
                sum += num;
            }
        }
            return cnt <= k;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
       
        for(int num : nums){
           low = Math.max(low,num);
           high += num;
        }
        int ans = high;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(canfit(nums, mid, k)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
             }

}