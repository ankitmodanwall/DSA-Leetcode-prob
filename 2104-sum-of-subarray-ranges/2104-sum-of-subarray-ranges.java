import java.util.*;

class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        int[] leftGreater = new int[n];
        int[] rightGreater = new int[n];
        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];

        Stack<Integer> st = new Stack<>();

        // ---------- LEFT GREATER ----------
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i])
                st.pop();
            leftGreater[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        st.clear();

        // ---------- RIGHT GREATER ----------
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i])
                st.pop();
            rightGreater[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }

        st.clear();

        // ---------- LEFT SMALLER ----------
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i])
                st.pop();
            leftSmaller[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        st.clear();

        // ---------- RIGHT SMALLER ----------
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i])
                st.pop();
            rightSmaller[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }

        long maxSum = 0, minSum = 0;

        for (int i = 0; i < n; i++) {
            maxSum += (long) nums[i] * leftGreater[i] * rightGreater[i];
            minSum += (long) nums[i] * leftSmaller[i] * rightSmaller[i];
        }

        return maxSum - minSum;
    }
}