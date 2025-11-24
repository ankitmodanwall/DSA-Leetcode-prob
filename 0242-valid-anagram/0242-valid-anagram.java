class Solution {
    public boolean isAnagram(String s, String t) {

        int m = s.length();
        int n = t.length();
        
        if (m != n) {
            return false;
        } else {
            int count[] = new int[26];
            for (int i = 0; i < m; i++) {
                count[s.charAt(i) - 'a']++;

            }
            for (int i = 0; i < n; i++) {
                count[t.charAt(i) - 'a']--;
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;

        }

    }
}