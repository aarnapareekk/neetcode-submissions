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
        //finding the middle element 
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the second half
        ListNode curr = slow.next;
        ListNode prev = null;
        slow.next = null;
        while(curr!= null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        // merge it now
        ListNode first = head;
        ListNode second = prev;
        while(second!= null){
            ListNode firstnext = first.next;
            ListNode secondnext = second.next;
            first.next = second;
            second.next = firstnext;
            //now upgrade first n second to new values to repeat the same.
            first = firstnext;
            second = secondnext;

        }

        
    }
}