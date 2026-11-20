// Balanced Binary Tree (Easy) - LeetCode 110
// Approach: post-order recursion. checkHeight returns the height of a subtree,
// or -1 as soon as any subtree is unbalanced (height difference greater than 1),
// and the -1 is passed straight up so every node is visited only once.
// Time: O(n), Space: O(h) for the recursion stack, h = tree height
// TreeNode is provided by LeetCode (val, left, right).
class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        // an empty tree has height 0
        if (root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }

        // unbalanced if the two subtrees differ in height by more than 1
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
