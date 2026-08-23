class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while(i < nums.length){
            nums[j] = nums[i];
            while(i < nums.length && nums[j] == nums[i]){
                i++;
            }
            j++;
        }
        return j;
    }
}