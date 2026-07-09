class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> occurances=new HashMap<>();
        int left=0;
        int result=0;
        int maxCount=0;
        for(int i=0;i<s.length();i++){
            occurances.put(s.charAt(i),occurances.getOrDefault(s.charAt(i),0)+1);
            maxCount=Math.max(maxCount,occurances.get(s.charAt(i)));
            while((i-left+1)-maxCount>k){
                occurances.put(s.charAt(left),occurances.get(s.charAt(left))-1);
                left++;
            }
            result=Math.max(result,i-left+1);
        }
        
        return result;
    }
}
