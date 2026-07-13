class Solution {
    public int specialArray(int[] nums) {
        int maxNum=-1;
        for(int i=0;i<nums.length;i++){
            maxNum=Math.max(maxNum,nums[i]);
        }
        int len=Math.min(nums.length,maxNum);
        for(int i=1;i<=len;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=i){
                    count++;
                }
                if(count>i){
                    break;
                }
            }
            if (count==i){
                return i;
            }
        }
        return -1;
        // Arrays.sort(nums);
        // int i = 0, prev = -1, totalRight = nums.length;
        // while (i < nums.length) {
        //     if (nums[i] == totalRight ||
        //        (prev < totalRight && totalRight < nums[i])) {
        //         return totalRight;
        //     }

        //     while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
        //         i++;
        //     }

        //     prev = nums[i];
        //     i++;
        //     totalRight = nums.length - i;
        // }

        // return -1;
    }
}