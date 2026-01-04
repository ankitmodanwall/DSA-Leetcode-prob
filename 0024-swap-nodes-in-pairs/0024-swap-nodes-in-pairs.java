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
    public ListNode swapPairs(ListNode head) {
        
ListNode dummy = new ListNode(0, head);
ListNode prev = dummy, curr = head;

while(curr!= null && curr.next != null){
    ListNode npn = curr.next.next;
    ListNode second = curr.next;

    second.next = curr;
    curr.next = npn; // npn = next pair node
    prev.next = second;

    prev = curr; // swap
    curr = npn;
}
return dummy.next;
    }
}