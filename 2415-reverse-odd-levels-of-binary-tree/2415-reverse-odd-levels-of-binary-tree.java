class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        DFS(root.left, root.right, 0);
        return root;
    }

    private void DFS(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) {
            return;
        }
        if (level % 2 == 0) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        DFS(left.left, right.right, level + 1);
        DFS(left.right, right.left, level + 1);
    }
}