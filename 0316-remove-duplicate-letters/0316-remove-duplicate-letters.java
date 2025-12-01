class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> s1 = new HashSet<>();
        Map<Character,Integer> last = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            last.put(s.charAt(i),i) ;     
            
             }
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!s1.contains(c)){
                while(!stack.isEmpty() && c < stack.peek() && i< last.get(stack.peek())){
                    s1.remove(stack.pop());
                }
                s1.add(c);
                stack.push(c);
            }
        }
            StringBuilder result = new StringBuilder();
            for(char c : stack){
                result.append(c);
            }
            return result.toString();

    }
}