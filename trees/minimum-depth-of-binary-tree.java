// Minimum Depth of Binary Tree (Easy) - LeetCode 111
// Approach: recursion. A node with a single child is not a leaf, so when one child
// is missing we must follow the other one. Take the minimum only when both exist.
// Time: O(n), Space: O(h) for the recursion stack, h = tree height
// TreeNode is provided by LeetCode (val, left, right).
class Solution {
    public int minDepth(TreeNode root) {
        // base case: an empty tree has depth 0
        if (root == null) {
            return 0;
        }

        // left child is missing: the path must go through the right child
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // right child is missing: the path must go through the left child
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // both children exist: take the shorter side
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
