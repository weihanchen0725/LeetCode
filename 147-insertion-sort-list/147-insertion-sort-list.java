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

//这个题这几本应该是能写出来的，但是有一点学习到了，就是如果做linkedlist时，如果需要两个指针一个指cur，一个指cur前一个，当有这样需求的时候，可以试试cur去替代前一个即pre，而让cur.next去代替cur，这样就可以少写一个指针，且能方便改变前后指针的方向；


class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre = dummy;
        
        while(cur != null && cur.next != null) {
            if(cur.val < cur.next.val) { // 这里就是用cur.next去替代原本的cur来进行判断； 另外就是这里直接找到第一个当前比下一个小的node，这样就可以保证新找到的cur.next，一定会插到cur的前面，这样cur所指的就一定是已经拍好序列的tail，最后一个node
                cur = cur.next;
            } else {
                pre = dummy;
                
                while(pre.next.val < cur.next.val) {
                    pre = pre.next;
                }
                
                ListNode next = cur.next.next;
                cur.next.next = pre.next;
                pre.next = cur.next;
                cur.next = next;  
            }
        }          
        return dummy.next;
    }
}