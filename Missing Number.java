
class Solution {
    public int missingNumber(int[] nums){
        int expeSum=0;
        for(int i=0;i<=nums.length;i++){
            expeSum=expeSum+i;
        }
        int obsSum=0;
        for(int i=0;i<nums. length;i++){
            obsSum=obsSum+nums[i];
        }
        return expeSum-obsSum;
    }
}                