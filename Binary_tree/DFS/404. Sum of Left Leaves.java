class Solution {
    int res = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return res;
    }
    
    private void dfs(TreeNode node) {
        if (node != null) {
            if (node.left != null && node.left.left == null && node.left.right == null) {
                res += node.left.val;
            }
            dfs(node.left);
            dfs(node.right);
        }
    }
}
