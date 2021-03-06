class Solution {
    class Trie {
        Trie[] sub = new Trie[26];
        LinkedList<String> suggestion = new LinkedList<>();
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie root = new Trie();
        Arrays.sort(products);
        
        for (String p: products) {
            Trie t = root;
            for (char c: p.toCharArray()) {
                if (t.sub[c - 'a'] == null) {
                    t.sub[c - 'a'] = new Trie();
                }
                t = t.sub[c - 'a'];
                if (t.suggestion.size() < 3) {
                    t.suggestion.offer(p);
                }
            }
        }
        
        List<List<String>> res = new ArrayList<>();
        for (char c: searchWord.toCharArray()) {
            if (root != null) {
                root = root.sub[c - 'a'];
            }
            res.add(root == null ? Arrays.asList() : root.suggestion);
        }
        return res;
    }
}
