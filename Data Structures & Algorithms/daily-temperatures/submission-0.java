class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        /*
        //bruteforce solution
        int[] result=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int j=i+1;
            result[i]=1;
            while(j<temperatures.length&&temperatures[j]<temperatures[i]){
                result[i]++;
                j++;
            }
            if (j==temperatures.length&&temperatures[j-1]<=temperatures[i]){
                result[i]=0;
            }
        }
        result[temperatures.length-1]=0;
        return result;
        */
        int[] result =new int[temperatures.length];
        Stack<int[]> stack=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&&stack.peek()[0]<temperatures[i]){
               int[] temp= stack.pop();
                result[temp[1]]=i-temp[1];
            }
            stack.push(new int[]{temperatures[i],i});
        }
        return result;
        
    }
}
