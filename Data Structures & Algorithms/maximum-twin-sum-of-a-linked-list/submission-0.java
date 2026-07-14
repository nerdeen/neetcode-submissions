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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        int [] numbers=new int[len];
        int i=0;
        while(temp!=null){
            numbers[i]=temp.val;
            temp=temp.next;
            i++;
        }
        int result=-1;
        int l=0;
        int r=len-1;
        while(l<r){
            result=Math.max((numbers[l++]+numbers[r--]),result);
        }
        return result;

    }
}