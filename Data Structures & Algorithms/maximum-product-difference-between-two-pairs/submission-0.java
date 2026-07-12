class Solution {
    public int maxProductDifference(int[] nums) {
        int firstMax=-1;
        int secondMax=-1;
        int firstMin=15000;
        int secondMin=15000;
        for(int i=0;i<nums.length;i++){
            if (nums[i]>=firstMax){
                secondMax=firstMax;
                firstMax=nums[i];
                
            }
            else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
            if (nums[i]<=firstMin){
                secondMin=firstMin;
                firstMin=nums[i];
            }
            else if (nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }
        System.out.println(firstMax);
        System.out.println(secondMax);
        System.out.println(firstMin);
        System.out.println(secondMin);

        return ((firstMax*secondMax)-(firstMin*secondMin));
    }
}