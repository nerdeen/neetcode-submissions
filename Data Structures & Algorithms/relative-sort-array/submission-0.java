class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Map<Integer,Integer> occurance=new HashMap<>();
        Set<Integer> exist=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            occurance.put(arr1[i],occurance.getOrDefault(arr1[i],0)+1);
        }

        for(int i=0;i<arr2.length;i++){
            exist.add(arr2[i]);
        }
        int [] result=new int[arr1.length];
        int x=0;
        for(int i=0;i<arr2.length;i++){
            if(occurance.containsKey(arr2[i])){
                for(int j=0;j<occurance.get(arr2[i]);j++ ){
                    result[x++]=arr2[i];
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(!exist.contains(arr1[i])){
                result[x++]=arr1[i];
            }
        }
        return result;

    }
}