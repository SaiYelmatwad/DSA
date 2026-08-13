class Solution {
    public int[] singleNumber(int[] nums) {
        int xXORy=0;
        for(int num: nums){
            xXORy=xXORy ^ num;            
        }
        int rbsm=xXORy & -xXORy;
        int[] ans=new int[2];

        for(int num: nums){
            if((num & rbsm)==0){
                ans[0]^=num;
            }else{
                ans[1]^=num;
            }
        }
        return ans;
    }
}