class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] > nums[j]) {
                    cnt++;
                }
            }
            l.add(cnt);

        }
        for (

                int i = 0; i < n; i++) {
            nums[i] = l.get(i);
        }
        return nums;
    }
}