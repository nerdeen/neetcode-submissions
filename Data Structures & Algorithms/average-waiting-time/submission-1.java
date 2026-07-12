class Solution {
    public double averageWaitingTime(int[][] customers) {
        long time=customers[0][1];
        long finishTime= customers[0][1]+customers[0][0];
        for(int i=1;i<customers.length;i++){
            long overlapping=Math.max(0,finishTime-customers[i][0]);
            time+= overlapping+ (customers[i][1]);
            finishTime= overlapping+customers[i][1]+customers[i][0];
        }
        return (double)time/customers.length;
    }
}