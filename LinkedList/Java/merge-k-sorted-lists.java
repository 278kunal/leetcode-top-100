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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0)
            return null;
          if(n==1)
        return lists[0];
    ListNode head=mergeTwoLists(lists[0],lists[1]);
    for(int i=2;i<n;i++){
    head=mergeTwoLists(head,lists[i]);
    }
    return head;
    }
    
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        if(headA==null)
    return headB;
    if(headB==null)
    return headA;
    ListNode tail=null,head=null;
    if(headA.val<=headB.val){
        head=tail=headA;
        headA=headA.next;
    } else {
        head=tail=headB;
        headB=headB.next;
    }
    
    while(headA!=null && headB!=null){
        if(headA.val<=headB.val){
            tail.next=headA;
            tail=headA;
            headA=headA.next;
        } else {
             tail.next=headB;
            tail=headB;
            headB=headB.next;
        }
      }
    if(headA==null)
    tail.next=headB;
    else
    tail.next=headA;
    
    return head;
    }
}