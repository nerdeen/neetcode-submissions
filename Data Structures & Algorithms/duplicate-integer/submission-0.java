class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> occurances=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(occurances.containsKey(nums[i])){
                return true;
            }
            occurances.put(nums[i],1);
        }
        return false;
    }
}