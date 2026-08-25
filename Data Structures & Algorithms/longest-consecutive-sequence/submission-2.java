class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        int count = 0;
        for(int n : nums){
            set.add(n);
        }
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int curr = nums[i];
                count = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
