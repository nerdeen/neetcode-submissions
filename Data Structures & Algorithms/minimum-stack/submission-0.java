class MinStack {
    List<Integer> stack;
    public MinStack() {
        stack=new LinkedList<>();
    }
    
    public void push(int val) {
        stack.addFirst(val);
    }
    
    public void pop() {
        stack.removeFirst();
    }
    
    public int top() {
        return stack.getFirst();
    }
    
    public int getMin() {
        int minNumber=Integer.MAX_VALUE;
        for (int num:stack){
            minNumber=Math.min(num,minNumber);
        }
        return minNumber;
    }
}
