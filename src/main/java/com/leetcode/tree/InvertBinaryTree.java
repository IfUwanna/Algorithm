package com.leetcode.tree;

import com.leetcode.core.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : com.leetcode.tree
 * fileName       : InvertBinaryTree
 * author         : Jihun Park
 * date           : 2022/02/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/14        Jihun Park       최초 생성
 */
public class InvertBinaryTree {
    /**
     * methodName : 226. Invert Binary Tree [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/invert-binary-tree/
     * @param root
     * @return tree node
     */
    public TreeNode invertTree(TreeNode root) {

        //1. Recursion - DFS
        if(root == null) return root;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    public TreeNode invertTree2(TreeNode root) {

        //2. Iteration - BFS
        if(root == null) return root;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;
            if(cur.left !=null) q.offer(cur.left);
            if(cur.right !=null) q.offer(cur.right);
        }

        return root;
    }


}
