class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroC = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                prod*= nums[i];
            }
            else{
                zeroC++;
            }
           
            
        }
        if(zeroC > 1){
            return new int[nums.length];
        }
        for(int i = 0; i < nums.length; i++){
            if(zeroC == 1){
                if(nums[i] == 0){
                    res[i] = prod;
                }
               
            }
            else{
                res[i] = prod / nums[i];
            }
        }
        return res;
        
    }
}  
