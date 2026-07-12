class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] result=new int[queries.length];
        boolean [] vowels=new boolean[words.length];
        for(int i=0;i<words.length;i++){
            if(((words[i].charAt(0)=='a') ||
            (words[i].charAt(0)=='e') ||
            (words[i].charAt(0)=='i') ||
            (words[i].charAt(0)=='o') ||
            (words[i].charAt(0)=='u')) && 
            ((words[i].charAt(words[i].length()-1)=='a') ||
            (words[i].charAt(words[i].length()-1)=='e') ||
            (words[i].charAt(words[i].length()-1)=='i') ||
            (words[i].charAt(words[i].length()-1)=='o') ||
            (words[i].charAt(words[i].length()-1)=='u')
            )){
                vowels[i]=true;
            }
        }
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            int count=0;
            for(int j=start;j<=end;j++){
                if (vowels[j]){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
}