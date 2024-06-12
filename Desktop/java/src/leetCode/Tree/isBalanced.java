package src.leetCode.Tree;

public class isBalanced {
    public boolean isBalanced(TreeNode root) {
            if(root == null){           // 空树
                return true;
            }else{
                return (Math.abs(height(root.left) - height(root.right))  <=1 && isBalanced(root.left) && isBalanced(root.right));
            }
    }

    public int height(TreeNode root){
        if(root == null) {
            return 0;
        }else {
            return Math.max(height(root.left),height(root.right)) +1 ;
        }
    }
}
