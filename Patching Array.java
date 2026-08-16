class Solution {
    public int minPatches(int[] nums, int n) {
        int minCount=0;
        long reach=0;
        int i=0;
        while(reach<n){
            if(i>nums.length){
                reach+=reach+1;
                minCount++;
            }
            else if(nums[i]<=reach+1 && i<nums.length){
                reach+=nums[i];
                i++;
            }else{
                reach+=reach+1;
                minCount++;
            }
        }
        return minCount;
    }
}