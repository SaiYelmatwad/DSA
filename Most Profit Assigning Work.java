class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxDiff = 0, totalProfit = 0;
        for (int i : difficulty) {
            maxDiff = Math.max(maxDiff, i);
        }
        int[] maxProfit = new int[maxDiff + 1];
        for (int i = 0; i < difficulty.length; i++) {
            maxProfit[difficulty[i]] =
                Math.max(maxProfit[difficulty[i]], profit[i]);
        }
        for (int i = 1; i < maxProfit.length; i++) {
            maxProfit[i] =
                Math.max(maxProfit[i], maxProfit[i - 1]);
        }
        for (int i : worker) {
            if (i > maxDiff) {
                totalProfit += maxProfit[maxDiff];
            } else {
                totalProfit += maxProfit[i];
            }
        }
        return totalProfit;
    }
}