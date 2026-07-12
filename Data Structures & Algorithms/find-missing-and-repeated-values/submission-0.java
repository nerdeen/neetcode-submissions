class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result=new int[2];
        Set<Integer> numbers=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(!numbers.add(grid[i][j])){
                    result[0]=grid[i][j];
                }
            }
        }
        int n=grid.length*grid.length;
        for(int i=1;i<=n;i++){
            if(!numbers.contains(i)){
                result[1]=i;
                return result;
            }
        }
        return result;
    }
}