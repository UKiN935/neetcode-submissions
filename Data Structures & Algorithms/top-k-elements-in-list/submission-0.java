class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            }
            else{
                map.put(n, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entry = new ArrayList<>(map.entrySet());
        entry.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for(int i = 0; i < k; i++){
            res[i] = entry.get(i).getKey();
        }
        return res;
    }
}
