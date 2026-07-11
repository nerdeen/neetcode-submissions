class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zeroes=0;
        if (flowerbed.length==1&& flowerbed[0]==0 &&n==1){
            return true;
        }
        if (flowerbed.length==1 &&n==0){
            return true;
        }
        for(int i=0;i<flowerbed.length;i++){
        
            if(flowerbed[i]==0){
                zeroes++;
                if(zeroes==3){
                    n--;
                    zeroes-=2;
                    if (n==0){
                        return true;
                    }
                }
                if(i==1&& flowerbed[0]==0 && flowerbed[1]==0 ){
                    n--;
                    zeroes-=2;
                    if (n==0){
                        return true;
                    }
                }
                if(i==flowerbed.length-1&& flowerbed[flowerbed.length-2]==0 && flowerbed[flowerbed.length-1]==0 ){
                    n--;
                    zeroes-=2;
                    if (n==0){
                        return true;
                    }
                }
            }
            else{
                zeroes=0;
            }
        }
        if(n==0){
            return true;
        }
        return false;
    }
}