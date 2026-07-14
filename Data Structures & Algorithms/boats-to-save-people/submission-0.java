class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r=people.length-1;
        int boats=0;
        while(l<=r){
            if (l!=r&&people[l]+people[r]<=limit){
                boats++;
                l++;
                r--;
            }
            else if (people[r]<=limit){
                r--;
                boats++;
            }
            if (l==r){
                boats++;
                l++;
                r--;
            }

        }
        return boats;
    }
}