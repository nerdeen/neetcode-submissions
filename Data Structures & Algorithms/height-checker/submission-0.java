class Solution {
    public int heightChecker(int[] heights) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],map.getOrDefault(heights[i],0)+1);
        }
        int i=0;
        int result=0;
        for(Map.Entry<Integer,Integer> item:map.entrySet()){
            int count =item.getValue();
            while(count>0){
                if(heights[i]!=item.getKey()){
                    result++;
                }
                count--;
                i++;
            }
        }
        return result;
    }
}