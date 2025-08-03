class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        seq(root1, s1);
        seq(root2, s2);
        return s1.equals(s2);
        
    }

    private void seq(TreeNode root, List<Integer> s){
        if(root==null) return;
        if(root.left==null && root.right==null) s.add(root.val);
        seq(root.left, s);
        seq(root.right, s);
    }
}