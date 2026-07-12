class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> occurrances=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            occurrances.put (arr[i],occurrances.getOrDefault(arr[i],0)+1);
        }
        int lucky=-1;
        for(Map.Entry<Integer,Integer> item:occurrances.entrySet()){
            if (item.getKey()==item.getValue()){
                 lucky=Math.max(lucky,item.getKey());
            }
        }
        return lucky;
    }
}