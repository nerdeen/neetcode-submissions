class Solution {
    public String reorganizeString(String s) {
        StringBuilder tempResult=new StringBuilder();
        Map<Character,Integer> occ=new HashMap<>();
        for(int i=0;i<s.length();i++){
            occ.put(s.charAt(i),occ.getOrDefault(s.charAt(i),0)+1);
            // if(occ.get(s.charAt(i))>((s.length()/2))){
            //     return "";
            // }
        }
        PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>(
            Comparator.comparingInt((Map.Entry<Character, Integer> item) -> item.getValue())
                      .reversed()
        );

        for(Map.Entry<Character,Integer> item:occ.entrySet()){
            q.offer(item);
        }
        Character lastChar=' ';
        while(!q.isEmpty()){
            Map.Entry<Character,Integer> item=q.poll();
            char currentCh = item.getKey();
            int val=item.getValue();
            if (lastChar!=currentCh){
                tempResult.append(currentCh);
                lastChar=currentCh;
                if (val>1){
                    item.setValue(val-1);
                    q.offer(item);
                }
            }
            else if (q.size()<=1){
                return "";
            } 
            else {
            Map.Entry<Character,Integer> tempItem=q.poll();
            char tempcurrentCh = tempItem.getKey();
            int tempval=tempItem.getValue();
             tempResult.append(tempcurrentCh);
                lastChar=tempcurrentCh;
                if (tempval>1){
                    tempItem.setValue(tempval-1);
                    q.offer(tempItem);
                }
                q.offer(item);
            }
        }
        return tempResult.toString();
    }
}