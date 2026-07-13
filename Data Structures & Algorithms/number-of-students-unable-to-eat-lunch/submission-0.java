class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleStudent=0;
        int squareStudent=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                circleStudent++;
            }
            else{
                squareStudent++;
            }
        }
        for(int i=0;i<sandwiches.length;i++){
            if (sandwiches[i]==0&&circleStudent>0){
                circleStudent--;
            }
            else if (sandwiches[i]==1&&squareStudent>0){
                squareStudent--;
            }
            else {
                return circleStudent+squareStudent;
            }
        }
        return 0;
    }
}