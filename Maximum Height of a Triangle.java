class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(helper(red, blue, true), helper(red, blue, false));
    }
    private int helper(int red, int blue, boolean isRed) {
        int height = 0;
        boolean current = isRed;
        while (true) {
            height++;
            if (current) {
                if (red >= height) {
                    red -= height;
                } else {
                    break;
                }
            } else {
                if (blue >= height) {
                    blue -= height;
                } else {
                    break;
                }
            }
            current = !current;
        }
        return height - 1;
    }
}