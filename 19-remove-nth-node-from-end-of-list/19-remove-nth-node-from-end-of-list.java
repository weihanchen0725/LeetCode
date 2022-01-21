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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy, tail = dummy;
        while(n >= 0){
            tail = tail.next;
            n -= 1;
        }
        while(tail != null){
            node = node.next;
            tail = tail.next;
        }
        node.next = node.next.next;
        return dummy.next;
    }
}