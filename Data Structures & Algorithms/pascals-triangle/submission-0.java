class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle=new ArrayList<>();
        pascalTriangle.add(new ArrayList<>(List.of(1)));
        if (numRows==1){
            return pascalTriangle;
        }
        pascalTriangle.add(new ArrayList<>(List.of(1, 1)));
        if (numRows==2){
            return pascalTriangle;
        }
        for(int i=2;i<numRows;i++){
            List<Integer>temp=new ArrayList<>();
            List<Integer> prev = pascalTriangle.get(i - 1);
            temp.add(1);
            for(int j=0;j<i-1;j++){
                temp.add(prev.get(j)+prev.get(j+1));
            }
            temp.add(1);
            pascalTriangle.add(temp);
        }
        return pascalTriangle;
    }
}