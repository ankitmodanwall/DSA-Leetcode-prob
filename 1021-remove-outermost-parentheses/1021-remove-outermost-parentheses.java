class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ct = new StringBuilder();
        int sum = 0, start = 0, end = 0;

        while (end < s.length()) {
            if (s.charAt(end) == '(')
                sum++;
            else
                sum--;

            if (sum == 0) {
                ct.append(s.substring(start + 1, end));
                start = end + 1;
            }
            end++;
        }
        return ct.toString();
    }
}