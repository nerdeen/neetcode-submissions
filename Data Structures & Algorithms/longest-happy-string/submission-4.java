class Solution {
    public String longestDiverseString(int a, int b, int c) {
        Map<Character,Integer> occ=new HashMap<>();
        occ.put('a',a);
        occ.put('b',b);
        occ.put('c',c);
        PriorityQueue<Map.Entry<Character,Integer>> q = new PriorityQueue<>(
            Comparator.comparingInt((Map.Entry<Character, Integer> item) -> item.getValue())
                      .reversed());
        for(Map.Entry<Character,Integer> item:occ.entrySet()){
            if(item.getValue()>0){
                q.offer(item);
            }
        }              
        StringBuilder result=new StringBuilder();
        char lastC=' ';
        boolean twoCon=false;
        while(!q.isEmpty()){
            System.out.println(lastC);
            Map.Entry<Character,Integer> item=q.poll();
            char ch=item.getKey();
            int v=item.getValue();
            if(ch!=lastC ){
                result.append(ch);
                lastC=ch;
                twoCon=false;
                item.setValue(v-1);
                if(v>1){
                    q.offer(item);
                }
            }
            else if (twoCon){
                if (q.size()==0){
                    return result.toString();
                }
                Map.Entry<Character,Integer> tempItem=q.poll();
                char tempC=tempItem.getKey();
                int tempV=tempItem.getValue();
                result.append(tempC);
                lastC=tempC;
                twoCon=false;
                tempItem.setValue(tempV-1);
                if(tempV>1){
                    q.offer(tempItem);
                }
                q.offer(item);
            }
            else{
                result.append(ch);
                lastC=ch;
                twoCon=true;
                item.setValue(v-1);
                if(v>1){
                    q.offer(item);
                }
            }
        }
        return result.toString();             
    }
}