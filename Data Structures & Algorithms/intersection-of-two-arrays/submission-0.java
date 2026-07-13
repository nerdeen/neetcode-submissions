class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mapNums1=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            mapNums1.put(nums1[i],mapNums1.getOrDefault(nums1[i],0)+1);
        }
        Set<Integer> result=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if (mapNums1.containsKey(nums2[i])){
                result.add(nums2[i]);
            }
        }
        int[] results=new int[result.size()];
        int i=0;
        for (Integer item : result){
            results[i]=item;
            i++;
        }
        
        return results;
        
    }
}