class Solution {
    public int firstUniqChar(String s) {
        // int s.length;
        char st[] = s.toCharArray();

            HashMap<Character,Integer> map = new HashMap<>();
            for(char m:st){
                map.put(m,map.getOrDefault(m,0) +1);
            }
            for(int i = 0; i<st.length; i++){
                if(map.get(st[i]) ==1 ){
                    return i;
                }
            }
            return -1;
    }
}