class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int content=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        int i=0;
        int len =Math.min(g.length,s.length);
        while(i<g.length&&j<s.length){
            if(g[i]<=s[j]){
                content++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return content;
    }
}