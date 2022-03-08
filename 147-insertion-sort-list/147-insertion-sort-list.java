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
    public ListNode insertionSortList(ListNode head) {
        ListNode node = new ListNode();
        node.next = head;
        ListNode current = head, previous = node;
        while(current != null && current.next != null){
            if(current.val < current.next.val){
                current = current.next;
            }else{
                previous = node;
                while(previous.next.val < current.next.val){
                    previous = previous.next;
                }
                ListNode next = current.next.next;
                current.next.next = previous.next;
                previous.next = current.next;
                current.next = next;
            }
        }
        return node.next;
    }
}