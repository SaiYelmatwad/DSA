class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1){
                return true;
            }
        }
        return false;
        // for(int i=0;i<arr.length-2;i++){
        //  int count=0;
        // for(int j=1;j<1+3;j++){
        // if(arr[j]%2!=0){
        //      count++;
        //        }
        //     }
        //     if(count==3){
        //         return true;
        //      }
        // }
        // return false;
    }
}