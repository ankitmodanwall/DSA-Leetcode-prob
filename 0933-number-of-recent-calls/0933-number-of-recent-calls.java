class RecentCounter {
private static final int[] record = new int[10000]; 
private int start;
private int end;
    public RecentCounter() {
        start = 0;
        end = 0;
    }
    
    public int ping(int t) {
        while(start < end && (t-record[start]> 3000)){
            start++;
        }
        record[end++] = t;
        return end - start;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */