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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode(), previous = node, current = head;
        node.next = head;
        while(current != null){
            if(current.next == null || current.val != current.next.val){
                previous = current;
                current = current.next;
            }else{
                while(current.next != null && current.val == current.next.val) current = current.next;
                previous.next = current.next;
                current = current.next;
            }
        }
        return node.next;
    }
}