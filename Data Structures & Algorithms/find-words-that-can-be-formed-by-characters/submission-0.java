class Solution {
    public int countCharacters(String[] words, String chars) {
        int result=0;
        Map<Character,Integer> occurrances=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            occurrances.put(chars.charAt(i),occurrances.getOrDefault(chars.charAt(i),0)+1);
        }
        for(int i=0;i< words.length;i++){
            Map<Character, Integer> curWord = new HashMap<>();
            boolean found=true;
            for(int j=0;j<words[i].length();j++){
                if (!occurrances.containsKey(words[i].charAt(j))){
                    found=false;
                    break;
                }
                curWord.put(words[i].charAt(j),curWord.getOrDefault(words[i].charAt(j),0)+1);
            }
            for(Map.Entry <Character, Integer> item: curWord.entrySet() ){
                if (item.getValue() > occurrances.getOrDefault(item.getKey(),0)){
                    found=false;
                    break;
                }
            }
            if (found==true){
                result+= words[i].length();
            }
        }
        return result;
    }
}