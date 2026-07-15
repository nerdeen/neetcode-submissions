class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> occ=new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            occ.put(nums[i],occ.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> item:occ.entrySet()){
            if (item.getValue()>(nums.length/3)){
                result.add(item.getKey());
            }
        }
        return result;
    }
}