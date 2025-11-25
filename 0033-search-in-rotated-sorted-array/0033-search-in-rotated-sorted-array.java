class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
           int mid = left + (right - left)/2;
            if(nums[mid] == target) 
            return mid;


// to check left part is sorted
        if (nums[mid]>= nums[left]){
            if(target>=nums[left] && target < nums[mid]){
                right = mid -1;
            }
            else {
                left = mid +1;
            }
        }

        // to check right part is sorted
            else {
                if (target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }
                else {
                    right = mid -1;
                }
            }
        }
    return -1;
    }
}