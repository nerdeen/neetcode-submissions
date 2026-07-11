class Solution {
    public int removeElement(int[] nums, int val) {
        /*
        int result=0;
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                temp.add(nums[i]);
                result++;
            }
        }
        for(int i=0;i<result;i++){
            nums[i]=temp.get(i);
        }
        return result;
        */
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}