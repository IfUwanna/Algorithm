package com.leetcode.tree;

import com.leetcode.core.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : com.leetcode.tree
 * fileName       : MaximumDepthOfBinaryTree
 * author         : Jihun Park
 * date           : 2022/02/11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/11        Jihun Park       최초 생성
 */
public class MaximumDepthOfBinaryTree {
    /**
     * methodName : 104. Maximum Depth of Binary Tree [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/maximum-depth-of-binary-tree/
     * @param root
     * @return int
     */
    public int maxDepth(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)return depth;
        q.offer(root);
        while(!q.isEmpty()){
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                TreeNode cur = q.poll();
                if(cur.left != null)q.offer(cur.left);
                if(cur.right != null)q.offer(cur.right);
            }
            depth++;
        }
        return depth;
    }
}
