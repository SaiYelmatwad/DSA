class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    private int helper(int[] nums, int k){
        int left=0, odd=0, totalCount=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[left]%2!=0){
                    odd--;                    
                }
                left++;
            }
            totalCount+=right-left+1;
        }
        return totalCount;
    }
}