class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> unique=new LinkedHashSet<>();
        for (int i=0;i<nums.length;i++){
            unique.add(nums[i]);
        }
        int l=0;
        for(Integer item:unique){
            nums[l++]=item;
        }
        return unique.size();
    }
}