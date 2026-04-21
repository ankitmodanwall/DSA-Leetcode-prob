/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length -1);
    }
    TreeNode build(int[] preorder, int[] inorder, int start, int end){
        if(start>end) return null;
        
        int rootval = preorder[preIndex++];
        TreeNode root = new TreeNode(rootval);

        int inIndex = find(inorder, start, end, rootval);

        root.left = build(preorder, inorder, start, inIndex -1);
        root.right = build(preorder , inorder, inIndex+1, end);
        return root;
    }

    int find(int[] arr, int s, int e, int key){
        for(int i = s; i<=e; i++) {
            if(arr[i] == key) return i;
        }
        return -1;
    }
}