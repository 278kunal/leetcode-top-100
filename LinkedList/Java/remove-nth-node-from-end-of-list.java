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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first=head;
        if(head==null)
            return head;
        for(int i=1;i<=n;i++)
            first=first.next;
        ListNode second=head,prevSec=null;
        while(first!=null){
            first=first.next;
            prevSec=second;
            second=second.next;
        }
        if(second==head){
            ListNode temp=second;
            head=head.next;
            temp=null;
        }
       else if(second.next==null)
            prevSec.next=null;
        else {
            prevSec.next=second.next;
        }
        return head;
    }
}