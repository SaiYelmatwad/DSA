class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);
        while (a <= b) {
            long val = a * a + b * b;
            if (val == c) {
                return true;
            } else if (val > c) {
                b--;
            } else {
                a++;
            }
        }
        return false;
    }
}