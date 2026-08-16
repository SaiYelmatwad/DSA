class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
       int start=0, sum=0, grumpySum=0, max=0;
       for(int end=0;end<customers.length;end++){
            if(grumpy[end]!=1){
                sum+=customers[end];
            }else{
                while(end-start+1>minutes){
                    if(grumpy[start]==1){
                    grumpySum-=customers[start];
                    }
                    start++;
                }
                grumpySum+=customers[end];
                max=Math.max(grumpySum,max);
            }
        } 
        return sum+max;
    }
}