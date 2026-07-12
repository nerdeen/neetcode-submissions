class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs=0;
        Map<Integer,Integer> occurrances=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            occurrances.put(nums[i],occurrances.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> item: occurrances.entrySet()){
            if (item.getValue()>1){
                pairs+=((item.getValue()-1)*(item.getValue()))/2;
            }
        }
        return pairs;
    }
}