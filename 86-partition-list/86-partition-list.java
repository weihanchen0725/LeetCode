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
        ListNode smallHead = new ListNode();
        ListNode smallTail = smallHead;
        ListNode bigHead = new ListNode();
        ListNode bigTail = bigHead;
        ListNode ptr = head;
        while(ptr != null){ 
            ListNode temp = ptr.next;
            if(ptr.val < x){
                smallTail.next = ptr;
                smallTail = smallTail.next;
                smallTail.next = null;
            }
            else {
                bigTail.next = ptr;
                bigTail = bigTail.next;
                bigTail.next = null;
            }
            ptr = temp;
        } 
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}