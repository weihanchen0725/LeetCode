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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode previous = new ListNode(), slow = head, fast = head;
        while(fast != null && fast.next != null){
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previous.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1, l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode result = new ListNode();
        ListNode l3 = result;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                l3.next = l1;
                l1 = l1.next;
            }else{
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if(l1 != null) l3.next = l1;
        if(l2 != null) l3.next = l2;
        return result.next;
    }
}