class Solution {
    public boolean isPerfectSquare(int num) {
        int sqrtNum = (int)Math.sqrt(num);
        return sqrtNum * sqrtNum == num;
    }
}