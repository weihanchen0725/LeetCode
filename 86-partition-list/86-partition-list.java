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
    public ListNode partition(ListNode head, int x) {
        ListNode bigHead = new ListNode(), bigTail = bigHead;
        ListNode smallHead = new ListNode(), smallTail = smallHead;
        ListNode current = head;
        while(current != null){
            ListNode temp = current.next;
            if(current.val < x){
                smallTail.next = current;
                smallTail = smallTail.next;
                smallTail.next = null;
            }else{
                bigTail.next = current;
                bigTail = bigTail.next;
                bigTail.next = null;
            }
            current = temp;
        }
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}