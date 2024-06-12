package src.leetCode.Tree;

public class findTargetNode {
    int cnt, result;
    public int findTargetNode(TreeNode root, int cnt) {
        this.cnt=cnt;
        dfs(root);
        return result;
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        // 搜索二叉树的中序遍历就是从小到大
        // 要满足找第k大的，就要找出从大到小的排序，也就是中序遍历的反向(先找右边再找左边)
        dfs(root.right);
        if(--cnt==0) result = root.val;
        dfs(root.left);
    }
}
