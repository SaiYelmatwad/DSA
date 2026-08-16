class Solution {
    public int longestSubarray(int[] nums, int limit) {
        LinkedList<Integer> max = new LinkedList<>(), min = new LinkedList<>();
        int ans = 0, start = 0;

        for (int end = 0; end < nums.length; end++) {
            int num = nums[end];
            while (max.size() > 0 && num < max.getLast()){ 
                max.removeLast();
            }
            max.add(num);

            while (min.size() > 0 && num > min.getLast()) {
                min.removeLast();
            }
            min.add(num);

            while (min.getFirst() - max.getFirst() > limit) {
                if (nums[start] == min.getFirst()){
                    min.removeFirst();
                }
                if (nums[start] == max.getFirst()) {
                    max.removeFirst();
                }
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }
}