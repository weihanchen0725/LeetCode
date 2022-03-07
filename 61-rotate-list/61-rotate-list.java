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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode node = new ListNode(), slow = node, fast = node;
        node.next = head;
        int length = 0;
        while(fast.next != null){
            fast = fast.next;
            length++;
        }
        if(length == 0) return head;
        k %= length;
        for(int index = 0; index < length-k; index++) slow = slow.next;
        fast.next = node.next;
        node.next = slow.next;
        slow.next = null;
        return node.next;
    }
}