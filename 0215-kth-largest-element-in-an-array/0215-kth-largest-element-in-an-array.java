class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       int i = 0;
        while(i<nums.length){
            pq.add(nums[i]);
            while(pq.size()>k){
                pq.remove();
            }
            i++;
        }
        return pq.peek();
    }
}