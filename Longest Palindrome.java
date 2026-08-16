class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> c = new HashSet<>();
        int count = 0;
        for (char i : s.toCharArray()) {
            if (c.contains(i)) {
                c.remove(i);
                count += 2;
            } else {
                c.add(i);
            }
        }
        if (!c.isEmpty()) {
            count += 1;
        }
        return count;
    }
}