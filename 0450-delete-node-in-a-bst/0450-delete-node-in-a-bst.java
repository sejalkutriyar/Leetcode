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
    public TreeNode deleteNode(TreeNode root, int key) {
        List<Integer> values = new ArrayList<>();
        inorder(root, key, values);

        TreeNode newRoot = null;

        for (int val : values) {
            newRoot = insert(newRoot, val);
        }

        return newRoot;
    }

    void inorder(TreeNode root, int key, List<Integer> values) {
        if (root == null) return;

        inorder(root.left, key, values);

        if (root.val != key) {
            values.add(root.val);
        }

        inorder(root.right, key, values);
    }

    TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }
}