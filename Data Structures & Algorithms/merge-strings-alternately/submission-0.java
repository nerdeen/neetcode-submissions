class Solution {
    public String mergeAlternately(String word1, String word2) {
        if (word1.length()==0){
            return word2;
        }
        else if (word2.length()==0){
            return word1;
        }
        int len =Math.min(word1.length(),word2.length());
        String temp="";
        for(int i=0;i<len;i++){
            temp+=word1.charAt(i);
            temp+=word2.charAt(i);
        }
        temp+=word1.substring(len,word1.length());
        temp+=word2.substring(len,word2.length());
        return temp;

    }
}