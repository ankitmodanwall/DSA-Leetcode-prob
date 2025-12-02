import java.util.*;

class Solution {
    public String simplifyPath(String path) {

        String[] s1 = path.split("/+");
        Stack<String> stack = new Stack();
        for (String t : s1) {
            if (t.equals("") || t.equals(".")) {
                continue;
            }
            if (t.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            }

            else {

                stack.push(t);
            }
        }
        return "/" + String.join("/", stack);

    }
}