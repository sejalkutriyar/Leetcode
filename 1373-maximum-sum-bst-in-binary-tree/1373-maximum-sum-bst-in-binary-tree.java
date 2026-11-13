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
    int ans = 0;
    class SubtreeInfo {
        boolean isBST;
        int min;
        int max;
        int sum;
        SubtreeInfo(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }
    public int maxSumBST(TreeNode root) {
        ans = 0;
        solve(root);
        return ans;
    }
    public SubtreeInfo solve(TreeNode root) {
        if(root == null) {
            return new SubtreeInfo(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        SubtreeInfo left = solve(root.left);
        SubtreeInfo right = solve(root.right);
        if(left.isBST && right.isBST && root.val > left.max && root.val < right.min) {
            int sum = left.sum + right.sum + root.val;
            ans = Math.max(sum, ans);
            return new SubtreeInfo(
                true,
                Math.min(root.val, left.min),
                Math.max(root.val, right.max),
                sum
            );
        }
        return new SubtreeInfo(false, 0, 0, 0);
    }
}