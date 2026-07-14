class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
        int[] result=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                result[j++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if (nums[i]%2!=0){
                result[j++]=nums[i];
            }
        }
        return result;
    }
}