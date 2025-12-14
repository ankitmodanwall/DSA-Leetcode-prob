class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1, last = -1;
            for(int i = 0; i<n; i++){
                if(nums[i] == target){
                    if(first == -1)
                    first = i;
                last = i;
                }
            }
        return new int[]{first, last};
    } 
}