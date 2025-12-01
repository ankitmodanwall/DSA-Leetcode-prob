class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] alphabet_cnt = new int[26];
        for (char c : magazine.toCharArray())
            alphabet_cnt[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (alphabet_cnt[c - 'a'] == 0)
                return false;
            alphabet_cnt[c - 'a']--;
        }
        return true;
    }
}