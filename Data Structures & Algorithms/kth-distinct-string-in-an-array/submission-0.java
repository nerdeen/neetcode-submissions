class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> occurrances=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            occurrances.put(arr[i],occurrances.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if (occurrances.get(arr[i])==1){
                k--;
                if(k==0){
                    return arr[i];
                }
            }
        }
        return "";
    }
}