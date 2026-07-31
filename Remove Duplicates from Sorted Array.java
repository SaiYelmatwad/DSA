class Solution {
    public int removeDuplicates(int[] nums){
        int count=0;
        int currIndex=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                nums[currIndex]=nums[i];
                return count+1;
            }
            if(nums[i]!=nums[i+1]){
                nums[currIndex]=nums[i];
                count++;
                currIndex++;
            }
        }
        return count;
    }
}   
