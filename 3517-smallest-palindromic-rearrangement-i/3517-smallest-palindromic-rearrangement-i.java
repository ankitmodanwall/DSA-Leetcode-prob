class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int m = n/2;
         
        if( n==1||n==2)
        return s;

        char[] ch = s.substring(0,m).toCharArray();
        Arrays.sort(ch);
        String str = new String(ch);

        StringBuilder rev = new StringBuilder(str).reverse();
        if(n%2 ==1){
            str += s.charAt(m);
        }
        return str + rev.toString();

    }
}