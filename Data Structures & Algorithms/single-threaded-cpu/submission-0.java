class Solution {
    public int[] getOrder(int[][] tasks) {
        int [] result=new int[tasks.length];
        PriorityQueue<List<Integer>> q=new PriorityQueue<>((a,b)->{
            if (a.get(1).equals(b.get(1))) {
                return Integer.compare(a.get(0), b.get(0)); // Secondary sorting by original index
            }
            return Integer.compare(a.get(1), b.get(1));     // Primary sorting by processing time
        });
        PriorityQueue<List<Integer>> eq=new PriorityQueue<>((a,b)->{
            return Integer.compare(a.get(0), b.get(0));     // Sort by enqueue time
        });
        int place=0;
        for(int i=0;i<tasks.length;i++){
            eq.offer(new ArrayList(List.of(tasks[i][0],tasks[i][1],i)));
        }
        long time = 0; // Use long to prevent overflow
        while(place < tasks.length){
            if (q.isEmpty() && !eq.isEmpty() && eq.peek().get(0) > time) {
                time = eq.peek().get(0);
            }
            while(!eq.isEmpty() && eq.peek().get(0) <= time) {
                q.offer(eq.poll());
            }
            if (!q.isEmpty()) {
                List<Integer> tempQ = q.poll();
                result[place++] = tempQ.get(2);
                time += tempQ.get(1);
            }
        }
        return result;
    }
}