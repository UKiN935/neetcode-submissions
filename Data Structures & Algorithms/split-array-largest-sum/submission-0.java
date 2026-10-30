class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int n : nums){
            high += n;
            low = Math.max(low, n);

        }
        int ans = high;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int subarr = 1;
            int curr = 0;
            for(int n : nums){
                if(curr + n > mid){
                    subarr++;
                    curr = n;
                }
                else{
                    curr += n;
                }
            }
                if(subarr <= k){
                    ans = mid;
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            
        
        return ans;
    }
}