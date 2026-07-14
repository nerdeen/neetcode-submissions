class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<List<Integer>> q = new PriorityQueue<>((a, b) -> {
    if (a.get(0).equals(b.get(0))) {
        return Integer.compare(a.get(1), b.get(1)); // Secondary sorting
    }
    return Integer.compare(a.get(0), b.get(0));     // Primary sorting
});
        for(int i=0;i<nums.length;i++){
            q.offer(new ArrayList(List.of(nums[i],i)));
        } 
        for(int i=0;i<k;i++){
            List<Integer> x=q.poll();
            int updatedValue = x.get(0) * multiplier;
            x.set(0, updatedValue);
            nums[x.get(1)]=x.get(0);
            q.offer(x);
        }
        return nums;
    }
}