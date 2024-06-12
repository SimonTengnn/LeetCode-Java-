package src.leetCode.Tree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class bfs {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();        // 每层都是一个list，所以遍历的总序列是一个双层的list(每个元素都为list的list)
        Queue<TreeNode> queue = new LinkedList<>();

        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){        // 队伍不空，就有新一层
            List<Integer> tmp = new ArrayList<>();
            for(int i=queue.size(); i>0; i--){
                TreeNode node = queue.poll();                // poll出队
                tmp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            ans.add(tmp);
        }
        return ans;

        /*
        // 如果返回二维数组
        int [][] result = new int[ans.size()][];
        for(int i=0; i<ans.size();i++){
            List<Integer> currentLevel = ans.get(i);    // 每一层的节点序列
            result[i] = new int[currentLevel.size()];
            for(int j=0;j< currentLevel.size(); j++){       // 一个个放进数组每一行
                result[i][j]=currentLevel.get(j);
            }
        }
        return result;
        */

    }
  }