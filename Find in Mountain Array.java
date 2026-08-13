/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peak(mountainArr);
        int targetIndex = search(mountainArr, target, 0, peak);
        if (targetIndex != -1) {
            return targetIndex;
        }
        return search(mountainArr, target, peak, mountainArr.length()-1); 
    }

    private int peak(MountainArray mountainArr) {
        int left = 0;
        int right = mountainArr.length() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                right = mid;

            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int search(MountainArray mountainArr,int target,int left, int right){
                                           
        boolean isAscending =mountainArr.get(left) < mountainArr.get(right);
 
        while (left <= right) {
            int mid=(left+right)/2;
            if(target==mountainArr.get(mid))
                return mid;

            if(isAscending)
                if(mountainArr.get(mid)<target)
                    left=mid+1;
                else
                    right=mid-1;
            else
                if(mountainArr.get(mid)<target)
                    right=mid-1;
                else
                    left=mid+1;
        }
        return -1;
    }

}    
