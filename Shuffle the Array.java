class Solution {
    public int[] shuffle(int[] nums, int n){
        int[] arr=new int[2*n];
        int p=0;
        for(int i=0;i<n;i++){
            arr[p++]=nums[i];
            arr[p++]=nums[n+i];
        }
        return arr;
    }
}