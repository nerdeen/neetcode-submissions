class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> numbers=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!numbers.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
