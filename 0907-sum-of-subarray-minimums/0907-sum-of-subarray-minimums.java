class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nextsm = nextsmaller(arr);
        int[] prevsm = prevsmaller(arr);
        int mod = 1000000007;
        long cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int first = i - prevsm[i];
            int second = nextsm[i] - i;
            long prod = (1L * first * second) % mod;
            prod = (prod * arr[i]) % mod;
            cnt = (cnt + prod) % mod;

        }
        return (int) cnt;

    }

    private int[] nextsmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = arr.length;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }
        return ans;
    }

    private int[] prevsmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }
        return ans;
    }

}