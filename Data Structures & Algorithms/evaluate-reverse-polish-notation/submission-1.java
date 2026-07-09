class Solution {
    public int evalRPN(String[] tokens) {
         Stack<String> stack = new Stack<>();
         int firstNumber;
         int secondNumber;
         int result;
         for(int i=0;i<tokens.length;i++){
            stack.push(tokens[i]);
            if ((stack.peek().equals("*"))){
                stack.pop();
                secondNumber=Integer.parseInt(stack.pop());
                firstNumber=Integer.parseInt(stack.pop());
                result=firstNumber*secondNumber;
                stack.push(String.valueOf( result));
            }
            else if ((stack.peek().equals("/"))){
                stack.pop();
                secondNumber=Integer.parseInt(stack.pop());
                firstNumber=Integer.parseInt(stack.pop());
                result=firstNumber/secondNumber;
                stack.push(String.valueOf( result));
            } 
            else if ((stack.peek().equals("+"))){
                stack.pop();
                secondNumber=Integer.parseInt(stack.pop());
                firstNumber=Integer.parseInt(stack.pop());
                result=firstNumber+secondNumber;
                stack.push(String.valueOf( result));
            }
            else if ((stack.peek().equals("-"))){
                stack.pop();
                secondNumber=Integer.parseInt(stack.pop());
                firstNumber=Integer.parseInt(stack.pop());
                result=firstNumber-secondNumber;
                stack.push(String.valueOf( result));
            }
         }
         return Integer.parseInt(stack.pop());
    }
}
