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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, temp1 = null, temp2 = null;
        int count = 0;
        while(head != null){
            count++;
            if(count == left){
                temp1 = prev;
                temp2 = head;
            }
            if(count > left && count < right){
                ListNode temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
                continue;
            }
            if(count == right){
                temp2.next = head.next;
                head.next = prev;
                temp1.next = head;
                break;
            }
            head = head.next;
            prev = prev.next;
        }
        return dummy.next;
    }
}