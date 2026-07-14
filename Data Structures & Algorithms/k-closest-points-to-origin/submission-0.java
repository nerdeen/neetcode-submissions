class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result= new int[k][2];
        PriorityQueue<List<Integer>> q=new PriorityQueue<>(Comparator.comparingInt(list -> list.get(0)));
        for (int i=0;i<points.length;i++){
            int distance =(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
            q.offer(new ArrayList<>(List.of(distance,points[i][0],points[i][1])));
        }
        for(int i=0;i<k;i++){
            List<Integer> temp=q.poll();
            result[i][0]=temp.get(1);
            result[i][1]=temp.get(2);
        }
        return result;

    }
}
