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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        }
    ListNode prev = null;
    ListNode curr = slow;
    while(curr!=null){
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }

    ListNode ll1 = head;
    ListNode ll2 = prev;
    while(ll2 != null){
        if(ll1.val != ll2.val){
            return false;
        }
        ll1=ll1.next;
        ll2=ll2.next;
    }
    return true;
    }
}