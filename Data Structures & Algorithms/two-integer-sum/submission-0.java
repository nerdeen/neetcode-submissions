class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complimentMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(complimentMap.containsKey(nums[i])){
                return(new int []{complimentMap.get(nums[i]),i});
            }
            complimentMap.put(comp,i);
        }
        return new int []{};
    }
}
