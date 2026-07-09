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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            nodes.add(current);
            current=current.next;
        }
        int place =nodes.size()-n;
        if (place == 0) {
            return head.next;
        }
        nodes.get(place - 1).next = nodes.get(place).next;
        return head;
    }
}
