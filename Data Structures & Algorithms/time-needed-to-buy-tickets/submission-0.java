class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // time taken all before me and one * after me
        //
        int time=0;
        for(int i=0;i<tickets.length;i++){
            if (i<k){
                time+=Math.min(tickets[i],tickets[k]);
            }
            else if (i==k){
                time+=tickets[k];
            }
            else{
                time+=Math.min(tickets[i],tickets[k]-1);
            }
        }
        return time;
    }
}