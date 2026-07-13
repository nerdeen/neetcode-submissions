class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0){
            return true;
        }
        int sPointer=0;
        int tPointer=0;
        while(sPointer<s.length()&&tPointer<t.length()){
            if(s.charAt(sPointer)==t.charAt(tPointer)){
                sPointer++;
                if(sPointer==s.length()){
                    return true;
                }
                tPointer++;
            }
            else{
                tPointer++;
            }
        }
        return false;
    }
}