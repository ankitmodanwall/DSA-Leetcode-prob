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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode mover = head.next;
        ListNode prev = head;
        ListNode dummy = new ListNode(-200);
        ListNode dummyMover = dummy;
        int corrupted = 200;
        while(mover!=null){
            if(prev.val == mover.val){
                corrupted = prev.val;
                            }
        else if(prev.val != mover.val && corrupted != prev.val){
            dummyMover.next = prev;
            dummyMover = dummyMover.next;

        }
        else if (prev.val != mover.val && corrupted != prev.val){
            dummyMover.next = prev;
            dummyMover = dummyMover.next;
        }
        else if (prev.val != mover.val && mover.next == null){
            dummyMover.next = mover;
            dummyMover = dummyMover.next;
        }
        prev = prev.next;
        mover = mover.next;
        }
        if(prev.next == null && prev.val != corrupted){
            dummyMover.next = prev;
            dummyMover = dummyMover.next;
        }
        dummyMover.next = null;
        dummy = dummy.next;
        return dummy;

    }
}