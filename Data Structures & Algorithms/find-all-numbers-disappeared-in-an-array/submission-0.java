class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set< Integer> numbers=new HashSet<>();
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            numbers.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!numbers.contains(i)){
                result.add(i);
            }
        }
        return result;

    }
}