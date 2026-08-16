class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        // double[] averages=new double[n/2];
        Arrays.sort(nums);
        double ans=nums[n-1];
        int p1=0;
        int p2=n-1;
        // int index=0;
        while(p1<=p2){
            double val=((double)nums[p1]+(double)nums[p2])/2.0;
            // index++;
            p1++;
            p2--;
            ans = Math.min(val,ans);
        }
        // Arrays.sort(averages);
        // return averages[0];
        return ans;
    }
}