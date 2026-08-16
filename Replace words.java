class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dict = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(findRoot(word, dict));
        }
        return ans.toString();
    }
    private String findRoot(String word, Set<String> dict) {
        for (int i = 0; i < word.length(); i++) {
            String prefix = word.substring(0, i + 1);
            if (dict.contains(prefix)) {
                return prefix;
            }
        }
        return word;
    }
}