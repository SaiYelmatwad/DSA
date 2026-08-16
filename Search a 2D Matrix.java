class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length, c=matrix[0].length;
        int start=0;
        int end=(r*c-1);
        while(start<=end){
            int mid=start +(end-start+1)/2;
            if(matrix[mid/c][mid%c]==target){
                return true;
            }else if(matrix[mid/c][mid%c]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        } 
        return false;
    }
}