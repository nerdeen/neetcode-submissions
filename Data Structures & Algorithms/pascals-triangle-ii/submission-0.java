class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex==0){
            return new ArrayList<>(List.of(1));
        }
        if(rowIndex==1){
            return new ArrayList<>(List.of(1, 1));
        } 
        List <Integer> temp=new ArrayList<>(List.of(1, 1));
        List<Integer> result=new ArrayList<>();
        for(int i=2;i<=rowIndex;i++) {
            result=new ArrayList<>();
            result.add(1);
            for(int j=0;j<temp.size()-1;j++){
                result.add(temp.get(j)+temp.get(j+1));
            }
            result.add(1);
            temp=result;
        }
        return result;
    }
}