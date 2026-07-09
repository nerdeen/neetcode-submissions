class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars= new Stack<>();
        for(int i=0;i<s.length();i++){
            if (chars.empty()&&
            (s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}')){
                return false;
            }
            else if((s.charAt(i)==')'&&chars.peek()=='(')||
            (s.charAt(i)=='}'&&chars.peek()=='{')||
            (s.charAt(i)==']'&&chars.peek()=='[')){
                chars.pop();
            }
            else if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                chars.push(s.charAt(i));
            }
            else{
                return false;
            }
        }
        return chars.empty();
    }
}
