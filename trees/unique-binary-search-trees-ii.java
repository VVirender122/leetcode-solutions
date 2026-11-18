// Unique Binary Search Trees II (Medium) - LeetCode 95
// Approach: recursion (divide and conquer). Try every value i in start..end as the root,
// build all left trees from start..i-1 and all right trees from i+1..end,
// then combine every left tree with every right tree.
// Time and space: grow with the Catalan number of trees (about 4^n / n^1.5)
// TreeNode is provided by LeetCode (val, left, right).
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return generate(1, n);
    }

    private List<TreeNode> generate(int start, int end) {
        List<TreeNode> result = new ArrayList<>();

        // empty range: a single null stands for "no subtree"
        if (start > end) {
            result.add(null);
            return result;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTrees = generate(start, i - 1);
            List<TreeNode> rightTrees = generate(i + 1, end);

            // combine every left subtree with every right subtree
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
