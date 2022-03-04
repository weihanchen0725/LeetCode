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
        ListNode dummyHead = new ListNode(-1), slow = dummyHead, fast = dummyHead;
        dummyHead.next = head;
        
        int len = 0;
        while(fast.next != null){   // fast REACH tail && Count len
            fast = fast.next; len++;
        }
        if(len == 0) return null;   // CHECK null
        
        k %= len;
        for(int i=0; i<len-k; i++)  // slow REACH before the rotated point 
            slow = slow.next;
        
        fast.next = dummyHead.next;      // CONNECT
        dummyHead.next = slow.next;
        slow.next = null;
        
        return dummyHead.next; 
    }
}