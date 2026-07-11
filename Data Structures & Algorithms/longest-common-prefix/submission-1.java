class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs[0].length();
        String pref="";
        for(int i=0;i<len;i++){
            for(int j=0; j<strs.length-1; j++){
                if((strs[j].length()<=i)|| (strs[j+1].length()<=i) || (strs[j].charAt(i)!=strs[j+1].charAt(i))){
                    return pref;
                }
            }
            pref+=strs[0].charAt(i);
        }
        return pref;
    }
}