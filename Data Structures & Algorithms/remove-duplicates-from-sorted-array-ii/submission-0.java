class Solution {
    public int removeDuplicates(int[] nums) {
        int place=0;
        int count=1;
        int [] temp=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if (count<3){
                    temp[place++]=nums[i];
                }
            if (nums[i]==nums[i+1]){
                count++;
            }
            else{
                count=1;
            }
            if((i==nums.length-2&&(nums[i]!=nums[i+1]))||( i==nums.length-2&& count<3)){
                temp[place++]= nums[i+1];
            }
            
        }
        for(int i=0;i<place;i++){
            nums[i]=temp[i];
        }
        return place;
    }
}