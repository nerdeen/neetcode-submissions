class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result=new ArrayList<>();
        if (arr.length==1){
            result.add(arr[0]);
            return result;
        }
        Arrays.sort(arr);
        int index =0;
        for(int i=0;i< arr.length-1;i++){
            if (arr[i]<=x &&arr[i+1]>=x){
                index=i;
                break;
            }
        }
        int l=index;
        int r=index+1;
        while( k>0){
            
            if (l>=0&&Math.abs(arr[l]-x)<=Math.abs(arr[r]-x)){
                result.add(arr[l]);
                l--;
                k--;
            }
            else if (r<arr.length){
                result.add(arr[r]);
                r++;
                k--;
            }
            else{
                result.add(arr[l]);
                l--;
                k--;
            }
        }
        Collections.sort(result);
        return result;

    }
}