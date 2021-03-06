class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s: words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(k, (a, b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
        
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            maxHeap.offer(entry);
        }
        
        List<String> res = new ArrayList<>();
        
        while (res.size() < k) {
            res.add(maxHeap.poll().getKey());
        }
        return res;
    }
}
