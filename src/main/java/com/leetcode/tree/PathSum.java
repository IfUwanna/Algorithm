package com.leetcode.tree;

import com.leetcode.core.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : com.leetcode.tree
 * fileName       : PathSum
 * author         : Jihun Park
 * date           : 2022/02/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/14        Jihun Park       최초 생성
 */
public class PathSum {
    /**
     * methodName : 112. Path Sum [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/path-sum/
     * @param root
     * @param targetSum
     * @return boolean
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 1. recursion - DFS
        if(root == null) return false;
        if(root.left == null && root.right == null) return targetSum - root.val == 0 ; // leaf node
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }

    public boolean hasPathSum2(TreeNode root, int targetSum) {
        // 2. Iteration - BFS
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> n = new LinkedList<>();
        q.offer(root);
        n.offer(root.val);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            Integer sum = n.poll();
            if(cur.left == null && cur.right==null) { // leaf node
                if(sum == targetSum) return true;
            }
            if(cur.left != null){
                q.offer(cur.left);
                n.offer(cur.left.val + sum);
            }
            if(cur.right != null){
                q.offer(cur.right);
                n.offer(cur.right.val + sum);
            }
        }
        return false;
    }

    public boolean dfs(TreeNode node, int targetSum, int sum) {

        if(node == null) return false;
        sum += node.val;
        if(node.left == null && node.right == null){ // leaf node
            if(targetSum == sum) return true;
            return false;
        }
        return dfs(node.left,targetSum,sum) || dfs(node.right,targetSum,sum);
    }
}
