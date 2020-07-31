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