class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int[][] nonOverlapping = new int[n][2];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        nonOverlapping[0][0] = intervals[0][0];
        nonOverlapping[0][1] = intervals[0][1];
        int index = 0;
        for(int i = 1; i < n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start <= nonOverlapping[index][1]){
                nonOverlapping[index][1] = Math.max(end, nonOverlapping[index][1]);
            }
            else{
                index++;
                nonOverlapping[index][0] = start;
                nonOverlapping[index][1] = end;
            }
        }
        
        return Arrays.copyOf(nonOverlapping, index + 1);
    }
}
