class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<gifts.length;i++){
            q.offer(gifts[i]);
        }
        for(int i=0;i<k;i++){
            int x=q.poll();
            q.offer((int) Math.sqrt(x));
        }
        int result=0;
        while(!q.isEmpty()){
            result+=q.poll();
        }
        return result;
    }
}