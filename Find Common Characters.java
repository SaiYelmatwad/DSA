class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];
        Arrays.fill(freq, Integer.MAX_VALUE);
        for (String word : words) {
            int[] count = new int[26];
            for (char C : word.toCharArray()) {
                count[C - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                freq[i] = Math.min(freq[i], count[i]);
            }
        }
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                ans.add(String.valueOf((char) (i + 'a')));
                freq[i]--;
            }
        }
        return ans;
    }
}