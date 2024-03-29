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
        ListNode node = new ListNode();
        node.next = head;
        ListNode temp1 = null, temp2 = null, previous = node;
        int count = 0;
        while(head != null){
            count++;
            if(count == left){
                temp1 = previous;
                temp2 = head;
            }else if(count > left && count < right){
                ListNode temp = head.next;
                head.next = previous;
                previous = head;
                head = temp;
                continue;
            }else if(count == right){
                temp2.next = head.next;
                head.next = previous;
                temp1.next = head;
                break;
            }
            head = head.next;
            previous = previous.next;
        }
        return node.next;
    }
}