class Solution {
    public int[] getConcatenation(int[] arr) {

        int n = arr.length;
	    int[] ans = new int[2 * n];
	    
	    for(int i = 0; i < arr.length; i++){
	        ans[i] = arr[i];
	    }
	    for(int i = (n - 1)+ 1; i < ans.length; i++){
	        ans[i] = arr[i - n];
	    }
        return ans;
        
    }
}