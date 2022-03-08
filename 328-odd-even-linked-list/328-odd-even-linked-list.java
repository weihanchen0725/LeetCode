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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode even = new ListNode(), evenHead = even;
        ListNode odd = new ListNode(), oddHead = odd;
        int index = 0;
        while(head != null){
            if(index % 2 == 0){
                even.next = head;
                even = even.next;
            }else{
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
            index++;
        }
        ListNode newHead = new ListNode();
        newHead = evenHead.next;
        even.next = oddHead.next;
        odd.next = null;
        return newHead;
    }
}