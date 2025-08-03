class Solution {
    public int goodNodes(TreeNode root) {
        return good(root, root.val);
    
    }
    
    private int good(TreeNode node, int m){
        if(node == null) return 0;
        if(node.val < m) return good(node.left, m) + good(node.right, m);
        m = node.val;
        return good(node.left, m) + good(node.right, m) + 1;
    }
}