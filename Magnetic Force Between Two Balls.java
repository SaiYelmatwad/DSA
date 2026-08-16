class Solution {
     
    private boolean isPossible(int[] position,int m,int mid){
        int prev=position[0];
        m-=1;
        for(int i=1;i<position.length && m>0;i++){
            if(position[i]-prev>=mid){
                m-=1;
                prev=position[i];
                if(m==0){
                    return true;
                }
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m){
        Arrays.sort(position);
        int ans=-1;
        int end=position[position.length-1]-position[0];
        int start=1;
        while(start<=end){
            int mid=start+(end-start)/2;
           if(isPossible(position, m, mid)){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}