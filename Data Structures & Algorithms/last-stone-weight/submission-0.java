class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<stones.length;i++){
            q.offer(stones[i]);
        }
        while(q.size()>1){
            int x=q.poll();
            int y=q.poll();
            q.offer(Math.abs(y-x));
        }
        return q.poll();
    }
}
