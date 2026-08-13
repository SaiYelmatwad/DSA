class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int i=0,j=0,k=0;
       int ans[] =new int[nums1. length+nums2.length];
       while(i< nums1.length && j< nums2. length){
         if(nums1[i]<nums2[j]){
            ans[k++]=nums1[i];
            i++;
            }else{
               ans[k++]=nums2[j];
               j++;
            }
        }
        if(i<nums1. length)
            while(i<nums1. length){
                ans[k++]=nums1[i];
                i++;
            }
        if(j<nums2. length)
            while(j<nums2. length){
                ans[k++]=nums2[j];
                j++;
            }
        int n=ans. length;
        if(n%2==0){
            int m1=ans[n/2 -1];
            int m2=ans[n/2];
            return (m1+m2)/2.0;
        }
        return ans[n/2];          
    }
}