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
    public int[] nextLargerNodes(ListNode head) {
        int arr[] = new int[size(head)];
        ListNode temp = head;
        int i = 0;
        while(temp != null){
        arr[i++] = temp.val;
        temp = temp.next;
    }
     int ans [] = new int[arr.length];
     Stack<Integer> st = new Stack<>();
     for(i = 0; i<arr.length; i++){
        while(!st.isEmpty() && arr[st.peek()] <arr[i]){
            ans[st.pop()] = arr[i];
        }
        st.push(i);
     }
     return ans;

}
private int size(ListNode head){
    ListNode temp = head;
    int s = 0;
    while(temp!=null){
        s++;
        temp=temp.next;
    }
    return s;
}

}