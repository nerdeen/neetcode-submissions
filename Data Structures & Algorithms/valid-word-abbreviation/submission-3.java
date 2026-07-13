class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int number=0;
        int i=0;
        int j =0;
        
        while(i<word.length()&&j<abbr.length()){
            
            if(abbr.charAt(j)>='a'&&abbr.charAt(j)==word.charAt(i)){
                j++;
                i++;
            }
            else if (abbr.charAt(j)>='a'&& abbr.charAt(j)!=word.charAt(i)){
                return false;
            }
            else if (abbr.charAt(j) == '0' && j>0 &&abbr.charAt(j-1)>='a' ) {
                    return false;
            }
            else {
                String str="";
                while(j<abbr.length()&&abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9'){
                    str+=abbr.charAt(j);
                    j++;
                }
                int num = Integer.parseInt(str);
                i+=num;
                
                

            }
            if (i>word.length()){
                return false;
            }
            if (i==word.length()&&j!=abbr.length()){
                return false;
            }
        }
        return true;
    }
}