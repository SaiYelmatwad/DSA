class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode children[];
    public TrieNode(char data) {
        this.data = data;
        this.isTerminating = false;
        this.children = new TrieNode[26];
    }
}
class Solution {
    private TrieNode root;
    public Solution() {
        root = new TrieNode('\0');
    }
    public void addHelper(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
        }
        addHelper(child, word.substring(1));
    }
    public void add(String word) {
        addHelper(root, word);
    }

    public String search(String word) {
        TrieNode current = root;
        String ans = "";
        for (int i = 0; i < word.length(); i++) {
            int childIndex = word.charAt(i) - 'a';

            if (current.children[childIndex] == null) {
                return word;
            }
            current = current.children[childIndex];
            ans += word.charAt(i);

            if (current.isTerminating) {
                return ans;
            }
        }

        return word;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        for (String word : dictionary) {
            add(word);
        }
        String[] words = sentence.split(" ");
        String ans = "";
        for (String word : words) {
            ans += search(word) + " ";
        }
        return ans.trim();
    }
}