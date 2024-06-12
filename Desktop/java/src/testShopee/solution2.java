package src.testShopee;

import apple.laf.JRSUIUtils;
import src.leetCode.Tree.bfs;

import java.util.*;

class TreeNode {
   int val = 0;
   TreeNode left = null;
   TreeNode right = null;
   public TreeNode(int val) {
     this.val = val;
   }
  }

public class solution2 {
    public int[][] levelNode(TreeNode root) {
        // write code here
        ArrayList<List<Integer>> list = new ArrayList<>();
        bfs(root,list);

        int depth=list.size();      // 记录一共多少层
        int[][] result = new int[depth][];  //存放结果

        for(int i=0;i<depth;i++){
           List<Integer> arr = list.get(i);
           for(int j=0;j<arr.size();j++){
               result[i][j] = arr.get(j);
           }
        }

        return result;

    }

    public static void bfs(TreeNode root,ArrayList<List<Integer>> list){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        while(!queue.isEmpty()){        // 队伍不空，就有新一层
            List<Integer> tmp = new ArrayList<>();
            for(int i=queue.size(); i>0; i--){
                TreeNode node = queue.poll();              // poll出队
                tmp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            list.add(tmp);
        }
    }
}
