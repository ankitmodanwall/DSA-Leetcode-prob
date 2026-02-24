class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++){
            // for(int j = i+1; j<nums.length; j++)
           if(nums[i] == nums[i+1]){
            arr.add(nums[i]);
            // break;
           }
        }
        return arr;
    }
}