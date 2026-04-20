class Solution {
    public int maxArea(int[] heights) {

        int i = 0;
        int j = heights.length - 1;
        int res = 0;
        while(i < j) {
            int width = Math.min(heights[i], heights[j]) * (j - i);

            res = Math.max(res, width);

            if(heights[i] <= heights[j]) {
                i++;
            }
            else{
                j--;
            }
        }
        return res;
        
    }
}
