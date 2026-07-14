/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack <Integer> numbers=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            numbers.push(temp.val);
            temp=temp.next;
        }
        while(!numbers.isEmpty()){
            
            if (numbers.peek()==head.val){
                numbers.pop();
                head=head.next;
            }
            else{
                return false;
            }
        
        }
        return true;

        
    }
}