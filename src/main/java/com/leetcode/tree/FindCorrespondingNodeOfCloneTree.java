package com.leetcode.tree;

import com.leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * packageName    : com.leetcode.tree
 * fileName       : FindCorrespondingNodeOfCloneTree
 * author         : Jihun Park
 * date           : 2022/05/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/17        Jihun Park       최초 생성
 */
public class FindCorrespondingNodeOfCloneTree {

    TreeNode cloneTarget;


    public TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inorderTraversal(original, cloned, target);
        return cloneTarget;
    }

    private void  inorderTraversal(TreeNode original, TreeNode cloned, TreeNode target) {
        if(original == null) return;
        inorderTraversal(original.left,cloned.left,target);
        if(original == target) cloneTarget = cloned;
        inorderTraversal(original.right,cloned.right,target);
    }

    public TreeNode getTargetCopy2(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        //2. Iteration (BFS with Queue)
        if(original == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> cq = new LinkedList<>();

        q.offer(original);
        cq.offer(cloned);

        while(!q.isEmpty()){

            TreeNode originCur = q.poll();
            TreeNode cloneCur = cq.poll();

            if(originCur == target) return cloneCur;

            if(originCur.left != null) q.offer(originCur.left);
            if(cloneCur.left != null) cq.offer(cloneCur.left);
            if(originCur.right != null) q.offer(originCur.right);
            if(cloneCur.right != null) cq.offer(cloneCur.right);
        }

        return null;
    }



}
