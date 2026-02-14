class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int num1current = nums1[i];
            int index = -1;
            for (int j = 0; j < nums2.length; j++) {
                int curr = nums2[j];
                if (curr == num1current) {
                    index = j;
                    break;
                }
            }
            int ans = -1;
            for (int j = index + 1; j < nums2.length; j++) {
                if (num1current < nums2[j]) {
                    ans = nums2[j];
                    break;
                }
            }
            list.add(ans);
        }
        int[] res = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            res[j] = list.get(j);
        }
        return res;
    }
}