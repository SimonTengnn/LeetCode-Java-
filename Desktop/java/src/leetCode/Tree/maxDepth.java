package src.leetCode.Tree;

public class maxDepth {
    public int maxDepth(TreeNode root) {
        int leftDepth = 0;
        int rightDepth = 0;
        if( root ==null){
            return 0;
        }else{
            leftDepth = maxDepth(root.left);
            rightDepth = maxDepth(root.right);
            return Math.max(leftDepth,rightDepth)+1;
        }

    }
}
