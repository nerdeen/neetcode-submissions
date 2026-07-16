class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result=new ArrayList<>();
        Set<Integer> numSet1=new HashSet<>();
        Set<Integer> numSet2=new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            numSet1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            numSet2.add(nums2[i]);
        }
        List<Integer> temp1=new ArrayList<>();
        List<Integer> temp2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if (!numSet2.contains(nums1[i])){
                temp1.add(nums1[i]);
                numSet2.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if (!numSet1.contains(nums2[i])){
                temp2.add(nums2[i]);
                numSet1.add(nums2[i]);
            }
        }
        result.add(temp1);
        result.add(temp2);
        return result;

    }
}