package src.leetCode.Tree;

public class isSubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root,subRoot);
    }

    public boolean dfs(TreeNode root,TreeNode subRoot){
            if(root == null){
                return false;
            }
            return check(root,subRoot) || dfs(root.left,subRoot) || dfs(root.right,subRoot);
            // 检查当前点                    如果当前点不满足，那就看左子树和右子树满不满足
    }

    public boolean check(TreeNode root,TreeNode subRoot){
       if(root == null && subRoot==null){
           return true;
       }
       if(root==null || subRoot==null || root.val != subRoot.val){  // 如果有一个是空的/两个点的val不一样就返回false
           return false;
       }
       return check(root.left,subRoot.left) && check(root.right,subRoot.right);
            // 递归check两棵树的左子树和右子树
    }



}
