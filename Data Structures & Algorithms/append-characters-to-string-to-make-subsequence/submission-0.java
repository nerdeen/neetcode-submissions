class Solution {
    public int appendCharacters(String s, String t) {
        int tPtr=0;
        int sPtr=0;
        while(tPtr<t.length()&&sPtr<s.length()){
            if(t.charAt(tPtr)==s.charAt(sPtr)){
                tPtr++;
                if(tPtr==t.length()){
                    return 0;
                }
                sPtr++;
            }
            else{
                sPtr++;
            }
        }
        return t.length()-tPtr;
    }
}