class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        int handSize = hand.length;
        for (int i = 0; i < handSize; i++) {
            if (hand[i] == -1) {
                continue;
            }
            int next = hand[i] + 1;
            hand[i] = -1;
            int count = 1;
            for (int j = i + 1; j < handSize && count < groupSize; j++) {
                if (hand[j] == next) {
                    next = hand[j] + 1;
                    hand[j] = -1;
                    count++;
                }
            }
            if (count != groupSize) {
                return false;
            }
        }
        return true;
    }
}