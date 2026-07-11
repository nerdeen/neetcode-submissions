class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> occurances=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            occurances.put(nums[i], occurances.getOrDefault(nums[i], 0) + 1);

        }
        for( Integer key : occurances.keySet()){
            if (occurances.get(key)>(nums.length/2)){
                return key;
            }
        }
        return 0;
    }
}