package src.leetCode.Tree;

import java.util.ArrayList;
import java.util.List;

public class preOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();      // 按顺序存放遍历结果
        preOrder(  root, list);
        return list;

    }

    public void preOrder(TreeNode root, List<Integer> list){    // 先序遍历：根-->左-->右
        if(root == null){
            return;
        }

       list.add(root.val);                    // 根节点加入list
        preOrder(root.left, list ) ;             //递归左
        preOrder(root.right, list);             //递归右边
    }
}
