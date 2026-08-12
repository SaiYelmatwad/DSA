class Solution {
    public int findMaxConsecutiveOnes(int [] nums){
        int maxCount=0;
        int Count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                Count++;
            }
            else{
                maxCount=Math.max(maxCount, Count);
                Count=0;
            }
        }
        maxCount=Math.max(maxCount, Count);
        return maxCount;        
    }
}