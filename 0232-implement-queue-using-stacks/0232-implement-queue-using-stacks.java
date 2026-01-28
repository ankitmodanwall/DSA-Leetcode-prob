class MyQueue {
    private Stack<Integer> inp;
    private Stack<Integer> op;

    public MyQueue() {
        inp = new Stack<>();
        op = new Stack<>();

    }

    public void push(int x) {
        inp.push(x);
    }

    public int pop() {
        peek();
        return op.pop();
    }

    public int peek() {
        if (op.isEmpty()) {
            while (!inp.isEmpty()) {
                op.push(inp.pop());
            }
        }
        return op.peek();
    }

    public boolean empty() {
        return inp.isEmpty() && op.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */