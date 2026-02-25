import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        // checking elements 
        // time complexity -> O(n) + O(k) + O(n-k) = O(n)
        //  Space complexity -> O(1)

        reverseNum(nums, 0, n - 1);
        reverseNum(nums, 0, k - 1);
        reverseNum(nums, k, n - 1);
    }

    public void reverseNum(int[] nums, int start, int end) {

        // swapping the elements 
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}