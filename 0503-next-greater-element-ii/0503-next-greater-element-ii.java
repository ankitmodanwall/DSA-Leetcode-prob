class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> nums1 = new Stack<>();
        int n  = nums.length;
        int []ans = new int[n];
        for(int i = 2*n-1; i>=0; i--){
        int current = nums[i%n];
        while(!nums1.isEmpty() && current >= nums1.peek()){
            nums1.pop();
        }
        if(i<n){
            ans[i] = nums1.isEmpty() ? -1:nums1.peek();
        }
        nums1.push(current);
    }
    return ans;
    }
}