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
        ListNode temp = null,dup=head;
        int index = 0,ind=0;
        while(head!=null){
            index++;
            if(index < left || index > right){
                head = head.next;continue;
            }
            else{
            if(temp == null){
                temp = new ListNode(head.val);
            }
            else{
            ListNode new_node = new ListNode(head.val);
            new_node.next = temp;
            temp = new_node;
            }
            head = head.next;
            }
        }
        ListNode ans = new ListNode(0);
        ListNode curr = ans,x=temp;
        while(dup!=null){
            ind++;
            if(ind<left||ind>right)
            {
                curr.next = new ListNode(dup.val);
                curr = curr.next;
            }
            else{
            
                curr.next = new ListNode(x.val);
                curr = curr.next;
                x = x.next;
                 }
            
            dup = dup.next;
        }
        return ans.next;
    }
}