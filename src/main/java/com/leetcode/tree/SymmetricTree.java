package com.leetcode.tree;

import com.leetcode.core.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : com.leetcode.tree
 * fileName       : SymmetricTree
 * author         : Jihun Park
 * date           : 2022/02/13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/13        Jihun Park       최초 생성
 */
public class SymmetricTree {
    /**
     * methodName : 101. Symmetric Tree [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/symmetric-tree/
     * @param root
     * @return boolean
     */
    public boolean isSymmetric(TreeNode root) {
        // 1. Recursion
        if(root == null) return true;
        return isSymmetric(root.left,root.right);

    }
    public boolean isSymmetric(TreeNode left, TreeNode right){

        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val){
            return false;
        }
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }

    public boolean isSymmetri2(TreeNode root) {
        // 2. Iteration
        if(root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);
        while(!q.isEmpty()){
            TreeNode left = q.poll();
            TreeNode right = q.poll();
            if(left == null && right != null) return false;
            if(left != null && right == null) return false;
            if(left != null && right != null){
                if ( left.val != right.val){
                    return false;
                }else{
                    q.offer(left.left);
                    q.offer(right.right);
                    q.offer(left.right);
                    q.offer(right.left);
                }
            }
        }
        return true;
    }

}
