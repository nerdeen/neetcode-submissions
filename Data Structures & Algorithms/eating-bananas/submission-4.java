class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        /*
        // bruteforce
        int speed=1;
        while(true){
           long totalTime = 0;
           for(int pile:piles){
            totalTime += (int) Math.ceil((double)pile/speed);
           } 
           if (totalTime<=h){
            return speed;
           }
           speed++;
        }
        */
        int left=1;
        int right=Arrays.stream(piles).max().getAsInt();
        int speed= right;
        while(left<=right){
            int mid=(right+left)/2;
            long totalTime=0;
            for(int pile:piles){
                totalTime+=(int) Math.ceil((double) pile/mid);
            }
            if (totalTime<=h){
                speed=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return speed;
    }
}
