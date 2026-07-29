lass Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();        int ans=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
        int n = m.getValue();
        int sum = ( (n - 1) * n) / 2;
        ans+= sum;
    }
    return ans;    
    
    }
}