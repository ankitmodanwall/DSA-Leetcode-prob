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
    public ListNode partition(ListNode head, int x) {
    ListNode dummyL = new ListNode(-1);
    ListNode dummyR = new ListNode(-1);

    ListNode left = dummyL;
    ListNode right = dummyR;

    ListNode temp = head;

    while(temp != null){
        if(temp.val < x){
            left.next = temp;
            left = left.next;
        }
        else {
            right.next = temp;
            right =right.next;
        }
        temp = temp.next;
    }
    left.next = dummyR.next;
    right.next = null;
    return dummyL.next;
    }
}