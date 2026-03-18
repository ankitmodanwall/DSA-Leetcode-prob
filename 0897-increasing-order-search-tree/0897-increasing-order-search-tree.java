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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> li = new ArrayList<>();
        TreeNode ans = new TreeNode(); //dummy
        inorder(root, li);
        Build(li, 0, ans);
        return ans.right;
    }

    public static void inorder(TreeNode root, ArrayList<Integer> li) {
        if (root == null) {
            return;
        }
        inorder(root.left, li);
        li.add(root.val);
        inorder(root.right, li);
    }

    public TreeNode Build(ArrayList<Integer> li, int i, TreeNode ans) {
        if (i == li.size()) {
            return ans;
        }
        TreeNode newnode = new TreeNode(li.get(i));
        ans.right = newnode;
        Build(li, i + 1, ans.right);
        return ans;

    }
}