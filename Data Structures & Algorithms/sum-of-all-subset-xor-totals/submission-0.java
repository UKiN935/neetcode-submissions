class Solution {
    public int solve(int[] nums, int idx, int xor){
        if(idx == nums.length){
            return xor;
        }
        return solve(nums, idx + 1, xor) + solve(nums, idx + 1, xor ^ nums[idx]);
    }
    public int subsetXORSum(int[] nums) {
        int idx = 0;
        int xor = 0;
        return solve(nums, idx, xor);
    }
}