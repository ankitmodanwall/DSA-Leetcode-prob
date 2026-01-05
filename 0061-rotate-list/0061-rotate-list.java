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
 import java.util.*;
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null  || head.next == null || k == 0)
        return head;
        int len = 1;
        ListNode tail = head;
        while(tail.next!= null){
            len++;
            tail = tail.next;
        }
        k = k % len;
        if(k ==0) return head;

        int breakpt = len -k;
        ListNode curr = head;
        for(int i = 1; i<breakpt; i++){
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;

        return newHead;


    }
}