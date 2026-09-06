class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        for(int i = 0; i < gas.length; i++){
            sumGas += gas[i];
            sumCost += cost[i];
        }
        if(sumGas < sumCost){
            return -1;
        }
        int startPoint = 0;
        int fuel = 0;
        for(int i = 0; i < gas.length; i++){
            fuel += gas[i] - cost[i];
            if(fuel < 0){
                fuel = 0;
                startPoint = i + 1;
            }
        }
        return startPoint;
    }
}
