class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int maxConsecutaive=1;
        int count=1;
        // sort 
        Arrays.sort(nums);
        //check if the current <= the coming and calc max 
        for(int i=1;i<nums.length;i++ ){
            if (nums[i]==nums[i-1]){
            }
            else if (nums[i]-nums[i-1]==1){
                count++;
            }
            else{
                count=1;
            }
            maxConsecutaive=Math.max(maxConsecutaive,count);

        }
        return maxConsecutaive;
    }
}
