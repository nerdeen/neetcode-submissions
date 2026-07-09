class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>sOccurances=new HashMap<>();
        Map<Character,Integer>tOccurances=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            sOccurances.put(s.charAt(i), sOccurances.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<t.length();i++){
            tOccurances.put(t.charAt(i), tOccurances.getOrDefault(t.charAt(i), 0) + 1);
            if(!sOccurances.containsKey(t.charAt(i))){
                return false ;
            }
            if (tOccurances.get(t.charAt(i))>sOccurances.get(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
