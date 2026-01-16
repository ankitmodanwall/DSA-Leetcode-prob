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
    public ListNode swapNodes(ListNode head, int k) {
     ListNode n1 = head;
     List<ListNode> n2 = new ArrayList<>();

     // storing nodes ---
    while(n1 != null){
        n2.add(n1);
        n1 = n1.next;
    }
    // swp

    int len = n2.size();
    int temp = n2.get(k-1).val;
    n2.get(k-1).val = n2.get(len-k).val;
    n2.get(len - k).val = temp;

    return head;


    }
}