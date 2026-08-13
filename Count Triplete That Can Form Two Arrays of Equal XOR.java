class Solution {
    public int countTriplets(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            for(int k=i+1;k<arr.length;k++){
                n=n^arr[k];
                if(n==0){
                    count+=(k-i);
                }
            }
        }
        return count;
    }
}