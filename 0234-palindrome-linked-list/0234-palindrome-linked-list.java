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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr  = temp;
        }
        return prev;
        
    }

    public boolean isPalindrome(ListNode head) {

     ListNode slow = head;
     ListNode fast =head;
     if(head==null || head.next==null){
        return true;
     }
     while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
     } 
     ListNode second = reverse(slow);
     ListNode first = head;
     ListNode temp = second;

     while(first!=null && temp!=null){
        if(first.val!=temp.val){
           return false;
        }
        first = first.next;
        temp = temp.next;
     }
        return true;
    }
}