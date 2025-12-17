class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 1_000_000_000;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isPossible(piles, h, mid))
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    private boolean isPossible(int[] piles, int h, int k) {
        int time = 0;
        for (int p : piles) {
            time += (p - 1) / k + 1;
            if (time > h)
                ;
        }
        return time <= h;
    }
}