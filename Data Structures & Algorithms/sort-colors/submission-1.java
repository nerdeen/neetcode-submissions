class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int j=0;
        for(int i=0;i<map.size();i++){
            if(map.containsKey(i)){
                int len=map.get(i);
                for(int k=0;k<len;k++){
                    nums[j]=i;
                    j++;
                }
            }
        }
        return;
    }
}