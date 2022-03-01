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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode node = head;
        while(node != null && node.next != null){
            if(node.next.val == val) node.next = node.next.next;
            else node = node.next;
        }
        if(head.val == val) return head.next;
        return head;
    }
}