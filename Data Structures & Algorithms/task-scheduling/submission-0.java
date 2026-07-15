class Solution {
    public int leastInterval(char[] tasks, int n) {
       Map<Character, Integer> counts = new HashMap<>();
       for (char task : tasks) {
           counts.put(task, counts.getOrDefault(task, 0) + 1);
       }
       
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
       pq.addAll(counts.values());
       
       int time = 0;
       while (!pq.isEmpty()) {
           List<Integer> temp = new ArrayList<>();
           int k = n + 1;
           while (k > 0 && !pq.isEmpty()) {
               int top = pq.poll();
               if (top > 1) temp.add(top - 1);
               time++;
               k--;
           }
           
           pq.addAll(temp);
           if (pq.isEmpty()) break;
           time += k; // Add remaining idle slots in this cycle
       }
       return time;
    }
}