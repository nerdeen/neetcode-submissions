class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                maxOnes=Math.max(ones,maxOnes);
                ones=-1;
            }
            ones++;
        }
        return Math.max(ones,maxOnes);
    }
}