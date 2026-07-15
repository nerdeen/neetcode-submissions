class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // PriorityQueue <List<Integer>> q=new PriorityQueue<>((a, b) -> {
        //     if (a.get(1).equals(b.get(1)) && a.get(0).equals(b.get(0))) {
        //         return Integer.compare(a.get(2), b.get(2));
        //     } 
        //     else if (a.get(1).equals(b.get(1))) {
        //         return Integer.compare(a.get(0), b.get(0));
        //     } 
        //     else {
        //         return Integer.compare(a.get(1), b.get(1));
        //     }
        // });
        // for( int i=0;i<trips.length;i++){
        //     q.offer(new ArrayList<>(List.of(trips[i][0],trips[i][1],trips[i][2])));
        // }
        // int fromPlace=0;
        // int toPlace=0;
        // while(!q.isEmpty()){
        //     List<Integer> temp=q.poll();
        //     if(toPlace>=temp.get(1)&&capacity>=temp.get(0)){
        //         capacity-=temp.get(0);
        //         fromPlace=temp.get(1);
        //         toPlace=Math.max(toPlace,temp.get(2));
        //     }
        //     else if (temp.get(1)>toPlace){
        //         capacity=temp.get(0);
        //         toPlace=temp.get(2);

        //     }
        //     else {

        //     }
        // }



        Arrays.sort(trips, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int curPass = 0;

        for (int[] trip : trips) {
            int numPass = trip[0], start = trip[1], end = trip[2];

            while (!minHeap.isEmpty() && minHeap.peek()[0] <= start) {
                curPass -= minHeap.poll()[1];
            }

            curPass += numPass;
            if (curPass > capacity) {
                return false;
            }

            minHeap.offer(new int[]{end, numPass});
        }

        return true;

    }
}