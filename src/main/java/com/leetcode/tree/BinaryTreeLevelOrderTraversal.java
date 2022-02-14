package com.leetcode.tree;

import com.leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    /**
     * methodName : 102. Binary Tree Level Order Traversal [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/binary-tree-level-order-traversal/
     * @param root
     * @return list
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        //1. Recursion(DFS)
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        levelorderTraversal(result,0,root);
        return result;

    }
    private void levelorderTraversal(List<List<Integer>> result, int level, TreeNode node) {
        if(node == null){return;}
        if(result.size() <= level){  // 현재 level List가 없을 경우  ex)size가 1이면 0뎁스까지밖에 없음. 1뎁스일때 만들어줘야함.
            List<Integer> row = new ArrayList<>();
            row.add(node.val);
            result.add(row);
        }else{
            List<Integer> row = result.get(level);
            row.add(node.val);
        }
        levelorderTraversal(result, level+1,node.left);
        levelorderTraversal(result, level+1,node.right);
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        //2. Iteration (BFS with Queue)
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int qSize = q.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < qSize; i++) {

                TreeNode cur = q.poll();
                row.add(cur.val);
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);

            }
            result.add(row);
        }
        
        return result;
    }

}
