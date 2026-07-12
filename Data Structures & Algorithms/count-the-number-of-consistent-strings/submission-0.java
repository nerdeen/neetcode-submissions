class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allow=new HashSet<>();
        int result=0;
        for(int i=0;i<allowed.length();i++){
            allow.add(allowed.charAt(i));
        }
        for(int i=0;i< words.length;i++){
            boolean found=true;
            for (int j=0;j<words[i].length();j++){
                if (!allow.contains(words[i].charAt(j))){
                    found=false;
                    break;
                }
            }
            if(found==true){
                result++;
            }
        }
        return result;
    }
}