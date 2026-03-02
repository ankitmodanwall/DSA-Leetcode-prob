class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> ch = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char i : num.toCharArray()){
            while(!ch.isEmpty() && k>0 && ch.peek() >i){
                ch.pop();
                k--;
            }
            ch.push(i);
        }
        while(!ch.isEmpty() && k>0){
            ch.pop();
            k--;
        }
        while(!ch.isEmpty()){
            sb.append(ch.pop());
        }
        sb.reverse();
        while(sb.length() >1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" :  sb.toString();



    }
}