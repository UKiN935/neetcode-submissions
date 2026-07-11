class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        int[] prefix = new int[n];
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            prefix[i] = nums[i];
            if(prefix[i] == k){
                ans++;
            }
            for(int j = i + 1; j < n; j++){
               
                prefix[j] = prefix[j - 1] + nums[j];
                if(prefix[j] == k){
                    ans++;
                }
            }
        }
        return ans;
    }
}