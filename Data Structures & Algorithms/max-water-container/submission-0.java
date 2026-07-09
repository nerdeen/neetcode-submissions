class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int area=0;
        while(left<right){
            int height=Math.min(heights[left],heights[right]);
            int width=right-left;
            int tempArea=width*height;
            area=Math.max(tempArea,area);
            if(heights[left]<heights[right]){
                left++;
                tempArea=width*height;
                area=Math.max(tempArea,area);
            }
           else{
                right--;
                tempArea=width*height;
                area=Math.max(tempArea,area);
            }
        }
        return area;
        
    }
}
