class Solution {

    public String encode(List<String> strs) {
       StringBuilder result =new StringBuilder();
       for(String element : strs){
        String size = String.format("%03d",element.length());
        result.append('#');
        result.append(size);
        result.append(element);
       }
       return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int i = 0;
        while( i<str.length()){
            int len = Integer.parseInt(str.substring(i + 1, i + 4));
            int start = i + 4;
            int end = start + len;
            result.add(str.substring(start, end));
            i = end;
        }
        return result;
    }
}
