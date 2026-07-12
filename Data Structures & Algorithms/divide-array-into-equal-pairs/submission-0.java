class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> occurrances=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            occurrances.put(nums[i],occurrances.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> item: occurrances.entrySet()){
            if (item.getValue()%2!=0){
                return false;
            }
        }
        return true;
    }
}