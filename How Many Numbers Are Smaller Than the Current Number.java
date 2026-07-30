class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int ans[]=new int[nums.length];
        int temp[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],i);
            }
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=map.get(nums[i]);        
        }
        return ans;
    }
}