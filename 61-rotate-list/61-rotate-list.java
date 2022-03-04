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
public class Solution {
 
  public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode end = head;
        ListNode newhead = head;
        ListNode newend = head;
        int listLength = 1;
        while(end.next != null){
            end = end.next;
            listLength++;
        }
        end.next = head; // make it a circle here
        for(int i = 0; i < listLength - (k % listLength); i++){
            newend = newhead;
            newhead = newhead.next;   
        }
        //end.next = head; when i put it here rather than the place above, it cannot pass, i don't know why. can you help me? why should we make a circle?
        newend.next = null;
        return newhead;
    }
}