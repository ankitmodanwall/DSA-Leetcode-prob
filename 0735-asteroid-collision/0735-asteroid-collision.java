class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            boolean flag = true;
            while (!stack.isEmpty() && i < 0 && stack.peek() > 0) {
                if (-i > stack.peek()) {
                    stack.pop();
                } else if (-i < stack.peek()) {
                    flag = false;
                    break;
                } else {
                    flag = false;
                    stack.pop();
                    break;
                }
            }
            if (flag) {
                stack.push(i);

            }
        }
        int[] arr = new int[stack.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;

    }
}