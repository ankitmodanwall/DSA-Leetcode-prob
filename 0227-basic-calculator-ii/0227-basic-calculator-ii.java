class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        char c = '+';
        long n = 0;

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (Character.isDigit(c1)) {
                n = n * 10 + (c1 - '0');
            }
            if (!Character.isDigit(c1) && !Character.isWhitespace(c1) || i == s.length() - 1) {
                if (c == '+') {
                    st.push((int) n);
                } else if (c == '-') {
                    st.push((int) (-n));
                } else if (c == '*') {
                    st.push(st.pop() * (int) n);
                } else if (c == '/') {
                    st.push(st.pop() / (int) n);
                }
                c = c1;
                n = 0;

            }
        }
        int res = 0;
        while (!st.isEmpty()) {
            res += st.pop();
        }
        return res;
    }
}