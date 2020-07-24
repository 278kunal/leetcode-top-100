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
    public void reorderList(ListNode head) {
      ListNode revList;
        if(head==null)
            return;
        ListNode curr=head;int len=1;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<len/2-1;i++){
            curr=curr.next;
        }
        revList=curr.next;
        curr.next=null;
        revList=reverse(revList);
        ListNode newList=head;
        curr=head;
        while(curr!=null && revList!=null){
            ListNode temp=curr.next;
            ListNode temp2=revList.next;
            curr.next=revList;
            curr.next.next=temp;
            curr=temp;
            revList=temp2;
        }
       // return head;
    }
    ListNode reverse(ListNode head){
        ListNode curr=head,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }   
    
}