class Solution {
    public void moveZeroes(int[] nums) {
        int [] temp=new int[ nums.length ];
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                temp[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        return;

    }
}