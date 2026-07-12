class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=false;
        boolean dec =false;
        boolean equ=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                inc =true;
                equ=false;
                if (dec==true){
                    return false;
                }
            }
            if (nums[i]<nums[i+1]){
                dec=true;
                equ=false;
                if(inc==true){
                    return false;
                }
            }
            else{
                equ=true;
            }
        }
        return (inc==true||dec==true||equ==true);
    }
}