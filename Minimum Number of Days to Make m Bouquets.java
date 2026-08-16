class Solution {

    private int noOfBouquets(int[] bloomDay, int mid, int k){
        int bouquets=0;
        int cnt=0;
        for(int i=0;i<bloomDay.length;i++){
            if (bloomDay[i] <= mid) {
                cnt++;
            }
            else{
                cnt=0;
            }
            if(cnt==k){
                bouquets++;
                cnt=0;
            }
        }
        return bouquets;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if(((long)(m*k))> bloomDay.length){
            return -1;
        }
        int start=0, end=0;
        for(int i:bloomDay){
            end=Math.max(i,end);
        }
        int minDays=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(noOfBouquets(bloomDay,mid,k)>=m){
                minDays=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return minDays;
    }
}  