class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result=new int[2];
        if (nums.length==2){
            result[0]=nums[0];
            result[1]=3-nums[0];
            return result;
        }
        Set <Integer> numbers=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if (!numbers.add(nums[i])){
                result[0]=nums[i];
            }
        }
        for(int i=0;i<numbers.size();i++){
            if (!numbers.contains(i+1)){
                result[1]=i+1;
                return result;
            }
        }
        return result;
    }
}