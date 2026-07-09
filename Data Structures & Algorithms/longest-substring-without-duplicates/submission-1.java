class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0){
            return 0;
        }
        int count =1;
        int maxCount=1;
        int firstPlace=0;
        Set<Character> chars=new HashSet<>();
        chars.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if (chars.add(s.charAt(i))){
                count++;
            }
            else{
                while(s.charAt(firstPlace)!=s.charAt(i)){
                    chars.remove(s.charAt(firstPlace));
                    firstPlace++;
                }
                firstPlace++;
                count=i-firstPlace+1;
                chars.add(s.charAt(i));
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
