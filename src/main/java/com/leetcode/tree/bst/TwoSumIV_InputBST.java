package com.leetcode.tree.bst;

import com.leetcode.core.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * packageName    : com.leetcode.tree.bst
 * fileName       : TwoSumIV_InputBST
 * author         : Jihun Park
 * date           : 2022/02/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/14        Jihun Park       최초 생성
 */
public class TwoSumIV_InputBST {
    /**
     * methodName : 653. Two Sum IV - Input is a BST [Easy[
     * author : Jihun Park
     * description : https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
     * @param root
     * @param k
     * @return boolean
     */
    public boolean findTarget(TreeNode root, int k) {

        //1. Recursion - DFS
        Set<Integer> set = new HashSet<>();
        return dfs(root,set,k);
    }

    public boolean dfs(TreeNode node, Set<Integer> set, int k){
        if(node == null) return false;
        if(set.contains(k-node.val)){
            return true;
        }
        set.add(node.val);
        return dfs(node.left, set, k) || dfs(node.right, set, k);
    }


    public boolean findTarget2(TreeNode root, int k) {

        //2. Iteration - BFS
        if(root == null) return false;
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            if(set.contains(k-cur.val)){
                return true;
            }
            set.add(cur.val);
            if(cur.left != null)q.offer(cur.left);
            if(cur.right != null)q.offer(cur.right);
        }
        return false;
    }
}
