import java.util.*;
class StockSpanner {
protected Stack<int[]> st;
    public StockSpanner() {
        
        st = new Stack<>();
        // st.push(0);
        // int ans = 1;
        // while(!st.isEmpty() && st.peek()<= )

    }
    
    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && st.peek()[0] <= price){
            span += st.pop()[1];
        }
        st.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */