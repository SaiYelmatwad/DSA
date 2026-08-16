class Solution {
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
        int i = 0;
        while (i <= p2) {
            if (nums[i] == 0) {
                int temp = nums[p1];
                nums[i] = temp;
                nums[p1] = 0;
                p1++;
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[p2];
                nums[i] = temp;
                nums[p2] = 2;
                p2--;
            } else {                
                i++;
            }
        }
    }
}