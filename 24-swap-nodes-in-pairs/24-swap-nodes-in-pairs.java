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
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode();
        node.next = head;
        ListNode pointer = node;
        while(pointer.next != null && pointer.next.next != null){
            ListNode pointer1 = pointer.next;
            ListNode pointer2 = pointer.next.next;
            pointer.next = pointer2;
            pointer1.next = pointer2.next;
            pointer2.next = pointer1;
            pointer = pointer1;
        }
        return node.next;
    }
}