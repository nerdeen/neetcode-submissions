class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> angrams=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] tempStringChar=strs[i].toCharArray();
            Arrays.sort(tempStringChar);
            String tempString=new String(tempStringChar);
            List<String>tempStringArray=new ArrayList<>(); 
            if (angrams.containsKey(tempString)){
               tempStringArray= angrams.get(tempString);
                System.out.println("if");

            }
            tempStringArray.add(strs[i]);
               angrams.put (tempString,tempStringArray);
        }
        // List<List<String>> result=new ArrayList<>();
        // angrams.forEach((key, value) -> {
        //     result.add(value);
        // });
        // return result;
        return new ArrayList<>(angrams.values());
    }
}
